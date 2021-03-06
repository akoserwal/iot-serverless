/*
 * Copyright 2016-2017 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.redhat.iot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="triggers")
public class TriggerData {

    @Id
    private String id;

    @Field(value="triggerName")
    private String triggerName;

    @Field(value="triggerNamespace")
    private String triggerNamespace;

    @Field(value="shortTriggerName")
    private String shortTriggerName;
    
    @Field(value="auth")
    private String authKey;
    
    @Field(value="topic")
    private String topic;
    
    public TriggerData() {
    }

    public TriggerData(String triggerName, String authKey) {
        this.triggerName = triggerName;
        this.authKey = authKey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getShortTriggerName() {
		return shortTriggerName;
	}

	public void setShortTriggerName(String shortTriggerName) {
		this.shortTriggerName = shortTriggerName;
	}

	public String getTriggerNamespace() {
		return triggerNamespace;
	}

	public void setTriggerNamespace(String triggerNamespace) {
		this.triggerNamespace = triggerNamespace;
	}
}
