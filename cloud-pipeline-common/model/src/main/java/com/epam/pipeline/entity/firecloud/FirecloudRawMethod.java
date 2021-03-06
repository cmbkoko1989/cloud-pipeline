/*
 * Copyright 2017-2019 EPAM Systems, Inc. (https://www.epam.com/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.pipeline.entity.firecloud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A plain object representing a response result of Firecloud.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FirecloudRawMethod {
    private String name;
    private String namespace;
    private String createDate;
    private String url;
    private String synopsis;
    private String entityType;
    private String snapshotId;

    //to simplify testing
    public FirecloudRawMethod clone() {
        return new FirecloudRawMethod(
                this.name,
                this.getNamespace(),
                this.createDate,
                this.getUrl(),
                this.getSynopsis(),
                this.getEntityType(),
                this.snapshotId
        );
    }
}
