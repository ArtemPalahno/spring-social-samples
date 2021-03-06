/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.movies.netflix.connect;

import org.springframework.social.oauth1.OAuth1Template;
import org.springframework.social.oauth1.OAuth1Version;
import org.springframework.util.MultiValueMap;

public class NetFlixOAuth1Template extends OAuth1Template {

	NetFlixOAuth1Template(String consumerKey, String consumerSecret, String requestTokenUrl, String authorizeUrl, String accessTokenUrl){
		super(consumerKey, consumerSecret, requestTokenUrl, authorizeUrl, accessTokenUrl, OAuth1Version.CORE_10);
	}
	
	@Override
	protected void addCustomAuthorizationParameters(MultiValueMap<String, String> parameters) {
		parameters.add("oauth_consumer_key", getConsumerKey());
	}
	
}
