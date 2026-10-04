package com.prism.lib.downloader.common;

import android.support.v4.media.session.f;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class DownloadProgress implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f178677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f178678b;

    public DownloadProgress(long j10, long j11) {
        this.f178677a = j10;
        this.f178678b = j11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("progress(");
        sb2.append(this.f178677a);
        sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
        return f.a(sb2, this.f178678b, ")");
    }
}
