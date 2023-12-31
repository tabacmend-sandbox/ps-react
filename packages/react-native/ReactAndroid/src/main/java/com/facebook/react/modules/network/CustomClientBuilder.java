/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.modules.network;

import okhttp3.OkHttpClient;

public interface CustomClientBuilder {
  public void apply(OkHttpClient.Builder builder);
}
