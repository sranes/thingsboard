/**
 * Copyright © 2016-2021 The Thingsboard Authors
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
package org.thingsboard.server.common.data.event;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.thingsboard.server.common.data.StringUtils;

@Data
@ApiModel
public class LifeCycleEventFilter implements EventFilter {
    private String server;
    private String event;
    private String status;
    private String error;

    @Override
    public EventType getEventType() {
        return EventType.LC_EVENT;
    }

    @Override
    public boolean hasFilterForJsonBody() {
        return !StringUtils.isEmpty(server) || !StringUtils.isEmpty(event) || !StringUtils.isEmpty(status) || !StringUtils.isEmpty(error);
    }
}
