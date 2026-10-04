package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.C1837v;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.V0;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.ui.text.Z;
import e.f0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n*L\n1#1,545:1\n653#2,24:546\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n*L\n498#1:546,24\n*E\n"})
public final class i {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94350a;

        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[IndexTransformationType.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndexTransformationType.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndexTransformationType.Replacement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndexTransformationType.Insertion.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f94350a = iArr;
        }
    }

    @f0
    public static final int a(@NotNull String str, int i10, boolean z10, @NotNull TransformedTextFieldState transformedTextFieldState) {
        int iA = z10 ? C1837v.a(str, i10) : C1837v.b(str, i10);
        if (iA == -1) {
            return i10;
        }
        long jR = transformedTextFieldState.r(iA);
        long jV = transformedTextFieldState.v(jR);
        int i11 = a.f94350a[((Z.h(jR) && Z.h(jV)) ? IndexTransformationType.Untransformed : (Z.h(jR) || Z.h(jV)) ? (!Z.h(jR) || Z.h(jV)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal()];
        if (i11 == 1 || i11 == 2) {
            return iA;
        }
        if (i11 == 3) {
            return z10 ? (int) (jV & ZipKt.f225990j) : (int) (jV >> 32);
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (z10) {
            if (iA == ((int) (jV >> 32))) {
                WedgeAffinity wedgeAffinity = WedgeAffinity.Start;
                transformedTextFieldState.H(new V0(wedgeAffinity, wedgeAffinity));
                return iA;
            }
            WedgeAffinity wedgeAffinity2 = WedgeAffinity.End;
            transformedTextFieldState.H(new V0(wedgeAffinity2, wedgeAffinity2));
            return i10;
        }
        if (iA == ((int) (jV & ZipKt.f225990j))) {
            WedgeAffinity wedgeAffinity3 = WedgeAffinity.End;
            transformedTextFieldState.H(new V0(wedgeAffinity3, wedgeAffinity3));
            return iA;
        }
        WedgeAffinity wedgeAffinity4 = WedgeAffinity.Start;
        transformedTextFieldState.H(new V0(wedgeAffinity4, wedgeAffinity4));
        return i10;
    }
}
