package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.AnimationUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import e.InterfaceC4348w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class KeylineState {
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final List<Keyline> keylines;
    private final int lastFocalKeylineIndex;

    public static final class Builder {
        private static final int NO_INDEX = -1;
        private static final float UNKNOWN_LOC = Float.MIN_VALUE;
        private final float availableSpace;
        private final float itemSize;
        private Keyline tmpFirstFocalKeyline;
        private Keyline tmpLastFocalKeyline;
        private final List<Keyline> tmpKeylines = new ArrayList();
        private int firstFocalKeylineIndex = -1;
        private int lastFocalKeylineIndex = -1;
        private float lastKeylineMaskedSize = 0.0f;
        private int latestAnchorKeylineIndex = -1;

        public Builder(float f10, float f11) {
            this.itemSize = f10;
            this.availableSpace = f11;
        }

        private static float calculateKeylineLocationForItemPosition(float f10, float f11, int i10, int i11) {
            return (i11 * f11) + (f10 - (i10 * f11));
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addAnchorKeyline(float f10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, float f12) {
            return addKeyline(f10, f11, f12, false, true);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10) {
            return addKeyline(f10, f11, f12, z10, false);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeylineRange(float f10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, float f12, int i10) {
            return addKeylineRange(f10, f11, f12, i10, false);
        }

        @NonNull
        public KeylineState build() {
            if (this.tmpFirstFocalKeyline == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.tmpKeylines.size(); i10++) {
                Keyline keyline = this.tmpKeylines.get(i10);
                arrayList.add(new Keyline(calculateKeylineLocationForItemPosition(this.tmpFirstFocalKeyline.locOffset, this.itemSize, this.firstFocalKeylineIndex, i10), keyline.locOffset, keyline.mask, keyline.maskedItemSize, keyline.isAnchor, keyline.cutoff));
            }
            return new KeylineState(this.itemSize, arrayList, this.firstFocalKeylineIndex, this.lastFocalKeylineIndex);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, float f12) {
            return addKeyline(f10, f11, f12, false);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeylineRange(float f10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    addKeyline((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10, boolean z11, float f13) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (!z10) {
                    int i10 = this.latestAnchorKeylineIndex;
                    if (i10 != -1 && i10 != 0) {
                        throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                    }
                    this.latestAnchorKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
            }
            Keyline keyline = new Keyline(Float.MIN_VALUE, f10, f11, f12, z11, f13);
            if (z10) {
                if (this.tmpFirstFocalKeyline == null) {
                    this.tmpFirstFocalKeyline = keyline;
                    this.firstFocalKeylineIndex = this.tmpKeylines.size();
                }
                if (this.lastFocalKeylineIndex != -1 && this.tmpKeylines.size() - this.lastFocalKeylineIndex > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 == this.tmpFirstFocalKeyline.maskedItemSize) {
                    this.tmpLastFocalKeyline = keyline;
                    this.lastFocalKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else {
                if (this.tmpFirstFocalKeyline == null && keyline.maskedItemSize < this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.tmpLastFocalKeyline != null && keyline.maskedItemSize > this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.lastKeylineMaskedSize = keyline.maskedItemSize;
            this.tmpKeylines.add(keyline);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            float f16 = this.availableSpace;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return addKeyline(f10, f11, f12, z10, z11, fAbs);
        }
    }

    public static final class Keyline {
        final float cutoff;
        final boolean isAnchor;
        final float loc;
        final float locOffset;
        final float mask;
        final float maskedItemSize;

        public Keyline(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f);
        }

        public static Keyline lerp(Keyline keyline, Keyline keyline2, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
            return new Keyline(AnimationUtils.lerp(keyline.loc, keyline2.loc, f10), AnimationUtils.lerp(keyline.locOffset, keyline2.locOffset, f10), AnimationUtils.lerp(keyline.mask, keyline2.mask, f10), AnimationUtils.lerp(keyline.maskedItemSize, keyline2.maskedItemSize, f10));
        }

        public Keyline(float f10, float f11, float f12, float f13, boolean z10, float f14) {
            this.loc = f10;
            this.locOffset = f11;
            this.mask = f12;
            this.maskedItemSize = f13;
            this.isAnchor = z10;
            this.cutoff = f14;
        }
    }

    public static KeylineState lerp(KeylineState keylineState, KeylineState keylineState2, float f10) {
        if (keylineState.getItemSize() != keylineState2.getItemSize()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<Keyline> keylines = keylineState.getKeylines();
        List<Keyline> keylines2 = keylineState2.getKeylines();
        if (keylines.size() != keylines2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < keylineState.getKeylines().size(); i10++) {
            arrayList.add(Keyline.lerp(keylines.get(i10), keylines2.get(i10), f10));
        }
        return new KeylineState(keylineState.getItemSize(), arrayList, AnimationUtils.lerp(keylineState.getFirstFocalKeylineIndex(), keylineState2.getFirstFocalKeylineIndex(), f10), AnimationUtils.lerp(keylineState.getLastFocalKeylineIndex(), keylineState2.getLastFocalKeylineIndex(), f10));
    }

    public static KeylineState reverse(KeylineState keylineState, float f10) {
        Builder builder = new Builder(keylineState.getItemSize(), f10);
        float f11 = (f10 - keylineState.getLastKeyline().locOffset) - (keylineState.getLastKeyline().maskedItemSize / 2.0f);
        int size = keylineState.getKeylines().size() - 1;
        while (size >= 0) {
            Keyline keyline = keylineState.getKeylines().get(size);
            builder.addKeyline((keyline.maskedItemSize / 2.0f) + f11, keyline.mask, keyline.maskedItemSize, size >= keylineState.getFirstFocalKeylineIndex() && size <= keylineState.getLastFocalKeylineIndex(), keyline.isAnchor);
            f11 += keyline.maskedItemSize;
            size--;
        }
        return builder.build();
    }

    public Keyline getFirstFocalKeyline() {
        return this.keylines.get(this.firstFocalKeylineIndex);
    }

    public int getFirstFocalKeylineIndex() {
        return this.firstFocalKeylineIndex;
    }

    public Keyline getFirstKeyline() {
        return this.keylines.get(0);
    }

    @Nullable
    public Keyline getFirstNonAnchorKeyline() {
        for (int i10 = 0; i10 < this.keylines.size(); i10++) {
            Keyline keyline = this.keylines.get(i10);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    public List<Keyline> getFocalKeylines() {
        return this.keylines.subList(this.firstFocalKeylineIndex, this.lastFocalKeylineIndex + 1);
    }

    public float getItemSize() {
        return this.itemSize;
    }

    public List<Keyline> getKeylines() {
        return this.keylines;
    }

    public Keyline getLastFocalKeyline() {
        return this.keylines.get(this.lastFocalKeylineIndex);
    }

    public int getLastFocalKeylineIndex() {
        return this.lastFocalKeylineIndex;
    }

    public Keyline getLastKeyline() {
        return (Keyline) androidx.appcompat.view.menu.d.a(this.keylines, 1);
    }

    @Nullable
    public Keyline getLastNonAnchorKeyline() {
        for (int size = this.keylines.size() - 1; size >= 0; size--) {
            Keyline keyline = this.keylines.get(size);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    private KeylineState(float f10, List<Keyline> list, int i10, int i11) {
        this.itemSize = f10;
        this.keylines = Collections.unmodifiableList(list);
        this.firstFocalKeylineIndex = i10;
        this.lastFocalKeylineIndex = i11;
    }
}
