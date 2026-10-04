package com.prism.lib.upgrade.api;

import Rd.d;
import Rd.e;
import Rd.o;
import com.prism.lib.upgrade.entity.CheckNewVersionResponse;
import java.util.Map;
import retrofit2.c;

/* JADX INFO: loaded from: classes7.dex */
public interface UpgradeServiceApi {
    @e
    @o("check_new_version")
    c<CheckNewVersionResponse> checkNewVersion(@d Map<String, Object> map);
}
