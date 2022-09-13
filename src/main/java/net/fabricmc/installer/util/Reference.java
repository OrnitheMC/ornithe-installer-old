/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
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

package net.fabricmc.installer.util;

public class Reference {
	public static final String LOADER_NAME = "ornithe-loader";

	public static final String SERVER_LAUNCHER_URL = "https://fabricmc.net/use/server/";
	public static final String MINECRAFT_VERSIONS_MANIFEST = "https://skyrising.github.io/mc-versions/version_manifest.json";

	static final String DEFAULT_META_SERVER = "https://meta.ornithemc.net/";
	static final String DEFAULT_MAVEN_SERVER = "https://maven.ornithemc.net/releases/";

	static final OrnitheService[] FABRIC_SERVICES = {
			new OrnitheService(DEFAULT_META_SERVER, DEFAULT_MAVEN_SERVER)
	};
}
