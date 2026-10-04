package androidx.compose.ui.text;

import java.text.BreakIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2359l {
    public static final int a(@NotNull String str, int i10) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i10);
    }

    public static final int b(@NotNull String str, int i10) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }
}
