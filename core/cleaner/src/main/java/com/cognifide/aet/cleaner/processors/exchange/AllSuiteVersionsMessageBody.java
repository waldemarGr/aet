/**
 * AET
 *
 * Copyright (C) 2013 Cognifide Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.cognifide.aet.cleaner.processors.exchange;

import com.cognifide.aet.communication.api.metadata.Suite;
import com.cognifide.aet.vs.DBKey;
import java.util.Collection;

public class AllSuiteVersionsMessageBody extends MessageBody<String> {

  private static final long serialVersionUID = -5200854871189039082L;

  private final Collection<Suite> allVersions;

  public AllSuiteVersionsMessageBody(String data, DBKey dbKey, Collection<Suite> allVersions) {
    super(data, dbKey);
    this.allVersions = allVersions;
  }

  public Collection<Suite> getAllVersions() {
    return allVersions;
  }
}
