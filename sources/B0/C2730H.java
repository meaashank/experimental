package b0;

import java.text.CharacterIterator;
import kotlin.jvm.internal.C4965q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b0.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2730H implements CharacterIterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f120566e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CharSequence f120567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f120568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f120569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f120570d;

    public C2730H(@NotNull CharSequence charSequence, int i10, int i11) {
        this.f120567a = charSequence;
        this.f120568b = i10;
        this.f120569c = i11;
        this.f120570d = i10;
    }

    @Override // java.text.CharacterIterator
    @NotNull
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i10 = this.f120570d;
        return i10 == this.f120569c ? C4965q.f217959c : this.f120567a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f120570d = this.f120568b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f120568b;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f120569c;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f120570d;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i10 = this.f120568b;
        int i11 = this.f120569c;
        if (i10 == i11) {
            this.f120570d = i11;
            return C4965q.f217959c;
        }
        int i12 = i11 - 1;
        this.f120570d = i12;
        return this.f120567a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i10 = this.f120570d + 1;
        this.f120570d = i10;
        int i11 = this.f120569c;
        if (i10 < i11) {
            return this.f120567a.charAt(i10);
        }
        this.f120570d = i11;
        return C4965q.f217959c;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i10 = this.f120570d;
        if (i10 <= this.f120568b) {
            return C4965q.f217959c;
        }
        int i11 = i10 - 1;
        this.f120570d = i11;
        return this.f120567a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i10) {
        int i11 = this.f120568b;
        if (i10 > this.f120569c || i11 > i10) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f120570d = i10;
        return current();
    }
}
