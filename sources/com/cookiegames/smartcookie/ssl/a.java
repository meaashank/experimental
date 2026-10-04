package com.cookiegames.smartcookie.ssl;

import android.net.Uri;
import androidx.compose.runtime.internal.r;
import com.cookiegames.smartcookie.ssl.SslWarningPreferences;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
@V({"SMAP\nSessionSslWarningPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionSslWarningPreferences.kt\ncom/cookiegames/smartcookie/ssl/SessionSslWarningPreferences\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n29#2:25\n29#2:27\n1#3:26\n*S KotlinDebug\n*F\n+ 1 SessionSslWarningPreferences.kt\ncom/cookiegames/smartcookie/ssl/SessionSslWarningPreferences\n*L\n17#1:25\n21#1:27\n*E\n"})
@r(parameters = 0)
public final class a implements SslWarningPreferences {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f148277b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HashMap<String, SslWarningPreferences.Behavior> f148278a = new HashMap<>();

    @Inject
    public a() {
    }

    @Override // com.cookiegames.smartcookie.ssl.SslWarningPreferences
    @Nullable
    public SslWarningPreferences.Behavior a(@Nullable String str) {
        Uri uri;
        String host;
        if (str == null || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return null;
        }
        return this.f148278a.get(host);
    }

    @Override // com.cookiegames.smartcookie.ssl.SslWarningPreferences
    public void b(@NotNull String url, @NotNull SslWarningPreferences.Behavior behavior) {
        G.p(url, "url");
        G.p(behavior, "behavior");
        String host = Uri.parse(url).getHost();
        if (host != null) {
            this.f148278a.put(host, behavior);
        }
    }
}
