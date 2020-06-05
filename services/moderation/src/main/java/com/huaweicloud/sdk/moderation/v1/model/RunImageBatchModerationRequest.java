package com.huaweicloud.sdk.moderation.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.moderation.v1.model.ImageBatchModerationReq;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class RunImageBatchModerationRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ImageBatchModerationReq body = null;

    public RunImageBatchModerationRequest withBody(ImageBatchModerationReq body) {
        this.body = body;
        return this;
    }

    public RunImageBatchModerationRequest withBody(Consumer<ImageBatchModerationReq> bodySetter) {
        if(this.body == null ){
            this.body = new ImageBatchModerationReq();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ImageBatchModerationReq getBody() {
        return body;
    }

    public void setBody(ImageBatchModerationReq body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunImageBatchModerationRequest runImageBatchModerationRequest = (RunImageBatchModerationRequest) o;
        return Objects.equals(this.body, runImageBatchModerationRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunImageBatchModerationRequest {\n");
            sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

