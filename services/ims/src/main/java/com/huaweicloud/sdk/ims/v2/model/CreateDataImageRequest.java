package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.CreateDataImageRequestBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class CreateDataImageRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateDataImageRequestBody body = null;

    public CreateDataImageRequest withBody(CreateDataImageRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateDataImageRequest withBody(Consumer<CreateDataImageRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateDataImageRequestBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateDataImageRequestBody getBody() {
        return body;
    }

    public void setBody(CreateDataImageRequestBody body) {
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
        CreateDataImageRequest createDataImageRequest = (CreateDataImageRequest) o;
        return Objects.equals(this.body, createDataImageRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDataImageRequest {\n");
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

