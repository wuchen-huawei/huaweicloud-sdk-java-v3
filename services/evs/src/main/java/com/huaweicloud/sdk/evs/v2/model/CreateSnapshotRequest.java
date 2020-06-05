package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotRequestBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class CreateSnapshotRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateSnapshotRequestBody body = null;

    public CreateSnapshotRequest withBody(CreateSnapshotRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateSnapshotRequest withBody(Consumer<CreateSnapshotRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateSnapshotRequestBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateSnapshotRequestBody getBody() {
        return body;
    }

    public void setBody(CreateSnapshotRequestBody body) {
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
        CreateSnapshotRequest createSnapshotRequest = (CreateSnapshotRequest) o;
        return Objects.equals(this.body, createSnapshotRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSnapshotRequest {\n");
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

