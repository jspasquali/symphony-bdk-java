package com.symphony.bdk.core.service.message.model;

import org.apiguardian.api.API;

/**
 * Search tier. Possible values are hot (default; only looks into recent messages, with a high speed search), warm
 * (only looks into older messages; search is much slower), all (looks into all messages; search is much slower)
 */
@API(status = API.Status.STABLE)
public enum SearchTier {
  HOT, WARM, ALL
}
