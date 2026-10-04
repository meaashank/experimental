package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import com.inmobi.media.C3588ic;
import e.f0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class TimeoutConfigurations$RenderTimeoutByType {

    @NotNull
    public static final C3588ic Companion = new C3588ic();
    private int audio;
    private int banner;

    /* JADX INFO: renamed from: int, reason: not valid java name */
    private int f8int;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    private int f9native;

    public /* synthetic */ TimeoutConfigurations$RenderTimeoutByType(C4969v c4969v) {
        this();
    }

    public final int getAudio$media_release() {
        return this.audio;
    }

    public final int getBanner$media_release() {
        return this.banner;
    }

    public final int getInt$media_release() {
        return this.f8int;
    }

    public final int getNative$media_release() {
        return this.f9native;
    }

    public final int getTimeoutByType$media_release(@NotNull String adType, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        G.p(adType, "adType");
        int iHashCode = adType.hashCode();
        if (iHashCode != -1396342996) {
            if (iHashCode != -1052618729) {
                if (iHashCode != 104431) {
                    if (iHashCode == 93166550 && adType.equals("audio") && (i14 = this.audio) > 0) {
                        return i14;
                    }
                } else if (adType.equals("int") && (i13 = this.f8int) > 0) {
                    return i13;
                }
            } else if (adType.equals("native") && (i12 = this.f9native) > 0) {
                return i12;
            }
        } else if (adType.equals("banner") && (i11 = this.banner) > 0) {
            return i11;
        }
        return i10;
    }

    public final void setAudio$media_release(int i10) {
        this.audio = i10;
    }

    public final void setBanner$media_release(int i10) {
        this.banner = i10;
    }

    public final void setInt$media_release(int i10) {
        this.f8int = i10;
    }

    public final void setNative$media_release(int i10) {
        this.f9native = i10;
    }

    @f0(otherwise = 5)
    public final void setTimeoutByType(@NotNull String adType, int i10) {
        G.p(adType, "adType");
        int iHashCode = adType.hashCode();
        if (iHashCode == -1396342996) {
            if (adType.equals("banner")) {
                this.banner = i10;
            }
        } else if (iHashCode == -1052618729) {
            if (adType.equals("native")) {
                this.f9native = i10;
            }
        } else if (iHashCode == 104431) {
            if (adType.equals("int")) {
                this.f8int = i10;
            }
        } else if (iHashCode == 93166550 && adType.equals("audio")) {
            this.audio = i10;
        }
    }

    private TimeoutConfigurations$RenderTimeoutByType() {
    }
}
