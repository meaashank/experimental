package G0;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;
import e.InterfaceC4337k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: G0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1161x {
    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float A(long j10) {
        return Color.luminance(j10);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float B(long j10) {
        return Color.red(j10);
    }

    public static final int C(@InterfaceC4337k int i10) {
        return (i10 >> 16) & 255;
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean D(long j10) {
        return Color.isSrgb(j10);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean E(long j10) {
        return Color.isWideGamut(j10);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color F(@NotNull Color color, @NotNull Color color2) {
        return C1162y.w(color2, color);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color G(@InterfaceC4337k int i10) {
        return Color.valueOf(i10);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color H(long j10) {
        return Color.valueOf(j10);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    @InterfaceC4337k
    public static final int I(long j10) {
        return Color.toArgb(j10);
    }

    @InterfaceC4337k
    public static final int J(@NotNull String str) {
        return Color.parseColor(str);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long K(@InterfaceC4337k int i10) {
        return Color.pack(i10);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float a(long j10) {
        return Color.red(j10);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float b(@NotNull Color color) {
        return color.getComponent(0);
    }

    public static final int c(@InterfaceC4337k int i10) {
        return (i10 >> 24) & 255;
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float d(long j10) {
        return Color.green(j10);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float e(@NotNull Color color) {
        return color.getComponent(1);
    }

    public static final int f(@InterfaceC4337k int i10) {
        return (i10 >> 16) & 255;
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float g(long j10) {
        return Color.blue(j10);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float h(@NotNull Color color) {
        return color.getComponent(2);
    }

    public static final int i(@InterfaceC4337k int i10) {
        return (i10 >> 8) & 255;
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float j(long j10) {
        return Color.alpha(j10);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float k(@NotNull Color color) {
        return color.getComponent(3);
    }

    public static final int l(@InterfaceC4337k int i10) {
        return i10 & 255;
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long m(@InterfaceC4337k int i10, @NotNull ColorSpace.Named named) {
        return Color.convert(i10, ColorSpace.get(named));
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long n(@InterfaceC4337k int i10, @NotNull ColorSpace colorSpace) {
        return Color.convert(i10, colorSpace);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long o(long j10, @NotNull ColorSpace.Named named) {
        return Color.convert(j10, ColorSpace.get(named));
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long p(long j10, @NotNull ColorSpace colorSpace) {
        return Color.convert(j10, colorSpace);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color q(@NotNull Color color, @NotNull ColorSpace.Named named) {
        return color.convert(ColorSpace.get(named));
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color r(@NotNull Color color, @NotNull ColorSpace colorSpace) {
        return color.convert(colorSpace);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float s(long j10) {
        return Color.alpha(j10);
    }

    public static final int t(@InterfaceC4337k int i10) {
        return (i10 >> 24) & 255;
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float u(long j10) {
        return Color.blue(j10);
    }

    public static final int v(@InterfaceC4337k int i10) {
        return i10 & 255;
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final ColorSpace w(long j10) {
        return Color.colorSpace(j10);
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float x(long j10) {
        return Color.green(j10);
    }

    public static final int y(@InterfaceC4337k int i10) {
        return (i10 >> 8) & 255;
    }

    @e.T(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float z(@InterfaceC4337k int i10) {
        return Color.luminance(i10);
    }
}
