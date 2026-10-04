package d0;

import androidx.compose.runtime.internal.r;
import java.text.BreakIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: d0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class C4288e extends AbstractC4285b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f194547f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CharSequence f194548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BreakIterator f194549e;

    public C4288e(@NotNull CharSequence charSequence) {
        this.f194548d = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f194549e = characterInstance;
    }

    @Override // d0.AbstractC4285b
    public int e(int i10) {
        return this.f194549e.following(i10);
    }

    @Override // d0.AbstractC4285b
    public int f(int i10) {
        return this.f194549e.preceding(i10);
    }
}
