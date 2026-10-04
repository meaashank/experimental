package androidx.compose.foundation.text;

import java.text.BreakIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.text.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nStringHelpers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringHelpers.android.kt\nandroidx/compose/foundation/text/StringHelpers_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class C1837v {
    public static final int a(@NotNull String str, int i10) {
        androidx.emoji2.text.c cVarC = c();
        Integer num = null;
        if (cVarC != null) {
            Integer numValueOf = Integer.valueOf(cVarC.e(str, i10));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i10);
    }

    public static final int b(@NotNull String str, int i10) {
        androidx.emoji2.text.c cVarC = c();
        Integer num = null;
        if (cVarC != null) {
            Integer numValueOf = Integer.valueOf(cVarC.h(str, Math.max(0, i10 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }

    public static final androidx.emoji2.text.c c() {
        if (androidx.emoji2.text.c.q()) {
            androidx.emoji2.text.c cVarC = androidx.emoji2.text.c.c();
            if (cVarC.i() == 1) {
                return cVarC;
            }
        }
        return null;
    }
}
