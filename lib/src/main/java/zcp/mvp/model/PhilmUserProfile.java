/*
 * Copyright 2014 Chris Banes
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package zcp.mvp.model;


public class PhilmUserProfile {

    Long _id;
    String username;
    String fullName;
    String avatarUrl;

    boolean twitterConnected;
    boolean facebookConnected;
    boolean pathConnected;
    boolean tumblrConnected;

    String defaultShareMessage;

    long lastFetched;

    public PhilmUserProfile() {}

    public String getUsername() {
        return username;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isTwitterConnected() {
        return twitterConnected;
    }

    public boolean isFacebookConnected() {
        return facebookConnected;
    }

    public boolean isPathConnected() {
        return pathConnected;
    }

    public boolean isTumblrConnected() {
        return tumblrConnected;
    }

    public long getLastFetched() {
        return lastFetched;
    }

    public String getDefaultShareMessage() {
        return defaultShareMessage;
    }
}
