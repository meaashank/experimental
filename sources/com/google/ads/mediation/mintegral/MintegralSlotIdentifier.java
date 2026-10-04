package com.google.ads.mediation.mintegral;

import androidx.constraintlayout.motion.widget.s;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class MintegralSlotIdentifier {

    @NotNull
    private final String adUnitId;

    @NotNull
    private final String placementId;

    public MintegralSlotIdentifier(@NotNull String adUnitId, @NotNull String placementId) {
        G.p(adUnitId, "adUnitId");
        G.p(placementId, "placementId");
        this.adUnitId = adUnitId;
        this.placementId = placementId;
    }

    public static /* synthetic */ MintegralSlotIdentifier copy$default(MintegralSlotIdentifier mintegralSlotIdentifier, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mintegralSlotIdentifier.adUnitId;
        }
        if ((i10 & 2) != 0) {
            str2 = mintegralSlotIdentifier.placementId;
        }
        return mintegralSlotIdentifier.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.adUnitId;
    }

    @NotNull
    public final String component2() {
        return this.placementId;
    }

    @NotNull
    public final MintegralSlotIdentifier copy(@NotNull String adUnitId, @NotNull String placementId) {
        G.p(adUnitId, "adUnitId");
        G.p(placementId, "placementId");
        return new MintegralSlotIdentifier(adUnitId, placementId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MintegralSlotIdentifier)) {
            return false;
        }
        MintegralSlotIdentifier mintegralSlotIdentifier = (MintegralSlotIdentifier) obj;
        return G.g(this.adUnitId, mintegralSlotIdentifier.adUnitId) && G.g(this.placementId, mintegralSlotIdentifier.placementId);
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    public int hashCode() {
        return this.placementId.hashCode() + (this.adUnitId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return s.a("MintegralSlotIdentifier(adUnitId=", this.adUnitId, ", placementId=", this.placementId, ")");
    }
}
