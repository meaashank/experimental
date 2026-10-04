package com.google.firebase.sessions.settings;

import ed.p;
import java.util.Map;
import kotlin.L0;
import kotlin.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public interface CrashlyticsSettingsFetcher {
    @Nullable
    Object doConfigFetch(@NotNull Map<String, String> map, @NotNull p<? super JSONObject, ? super e<? super L0>, ? extends Object> pVar, @NotNull p<? super String, ? super e<? super L0>, ? extends Object> pVar2, @NotNull e<? super L0> eVar);
}
