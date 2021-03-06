/*
 * Copyright 2020 Huawei Technologies Co.,Ltd.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huaweicloud.sdk.core.impl;

import com.huaweicloud.sdk.core.http.HttpResponse;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

public class DefaultHttpResponse implements HttpResponse {

    private static final Logger logger = LoggerFactory.getLogger(DefaultHttpResponse.class);
    private Response response;
    private String strBody;


    private DefaultHttpResponse(Response response) {
        this.response = response;
        try {
            strBody = response.body().string();
        } catch (IOException e) {
            logger.error("Read http response body error!", e);
        }
    }

    static DefaultHttpResponse wrap(Response response) {
        return new DefaultHttpResponse(response);
    }

    @Override
    public int getStatusCode() {
        return response.code();
    }

    @Override
    public String getContentType() {
        return response.body().contentType().toString();
    }

    @Override
    public Map<String, String> getHeaders() {
        return response.headers().toMultimap().entrySet().stream()
            .collect(Collectors.toMap(Map.Entry::getKey, values -> values.getValue().get(0)));
    }

    @Override
    public String getBodyAsString() {
        return strBody;
    }

    @Override
    public String getHeader(String name) {
        return response.header(name);
    }
}
