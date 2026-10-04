package B0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import e.InterfaceC4332f;
import e.a0;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: B0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0921e {
    public static final <T> T a(Context context) {
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public static final void b(@NotNull Context context, @a0 int i10, @NotNull int[] iArr, @NotNull ed.l<? super TypedArray, L0> lVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, iArr);
        lVar.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void c(@NotNull Context context, @Nullable AttributeSet attributeSet, @NotNull int[] iArr, @InterfaceC4332f int i10, @a0 int i11, @NotNull ed.l<? super TypedArray, L0> lVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        lVar.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void d(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, ed.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributeSet = null;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        lVar.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
