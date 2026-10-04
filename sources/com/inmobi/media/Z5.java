package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.collection.C1550p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class Z5 implements Parcelable {

    @NotNull
    public static final X5 CREATOR = new X5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3470a6 f152647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f152649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f152650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlin.G f152651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f152652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f152653g;

    public Z5(C3470a6 landingPageTelemetryMetaData, String urlType, int i10, long j10) {
        kotlin.jvm.internal.G.p(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        kotlin.jvm.internal.G.p(urlType, "urlType");
        this.f152647a = landingPageTelemetryMetaData;
        this.f152648b = urlType;
        this.f152649c = i10;
        this.f152650d = j10;
        this.f152651e = kotlin.I.a(Y5.f152625a);
        this.f152652f = -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z5)) {
            return false;
        }
        Z5 z52 = (Z5) obj;
        return kotlin.jvm.internal.G.g(this.f152647a, z52.f152647a) && kotlin.jvm.internal.G.g(this.f152648b, z52.f152648b) && this.f152649c == z52.f152649c && this.f152650d == z52.f152650d;
    }

    public final int hashCode() {
        return C1550p.a(this.f152650d) + ((this.f152649c + androidx.compose.foundation.text.modifiers.l.a(this.f152648b, this.f152647a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "LandingPageTelemetryControlInfo(landingPageTelemetryMetaData=" + this.f152647a + ", urlType=" + this.f152648b + ", counter=" + this.f152649c + ", startTime=" + this.f152650d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        kotlin.jvm.internal.G.p(parcel, "parcel");
        parcel.writeLong(this.f152647a.f152692a);
        parcel.writeString(this.f152647a.f152693b);
        parcel.writeString(this.f152647a.f152694c);
        parcel.writeString(this.f152647a.f152695d);
        parcel.writeString(this.f152647a.f152696e);
        parcel.writeString(this.f152647a.f152697f);
        parcel.writeString(this.f152647a.f152698g);
        parcel.writeByte(this.f152647a.f152699h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f152647a.f152700i);
        parcel.writeString(this.f152648b);
        parcel.writeInt(this.f152649c);
        parcel.writeLong(this.f152650d);
        parcel.writeInt(this.f152652f);
        parcel.writeString(this.f152653g);
    }

    public /* synthetic */ Z5(C3470a6 c3470a6, String str, int i10, int i11) {
        this(c3470a6, str, (i11 & 4) != 0 ? 0 : i10, SystemClock.elapsedRealtime());
    }
}
