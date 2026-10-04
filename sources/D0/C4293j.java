package d0;

import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: d0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class C4293j implements InterfaceC4289f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f194561e = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CharSequence f194562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C4292i f194563d;

    public C4293j(@NotNull CharSequence charSequence, @NotNull C4292i c4292i) {
        this.f194562c = charSequence;
        this.f194563d = c4292i;
    }

    @Override // d0.InterfaceC4289f
    public int a(int i10) {
        do {
            i10 = this.f194563d.o(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f194562c.charAt(i10 - 1)));
        return i10;
    }

    @Override // d0.InterfaceC4289f
    public int b(int i10) {
        do {
            i10 = this.f194563d.n(i10);
            if (i10 == -1 || i10 == this.f194562c.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.f194562c.charAt(i10)));
        return i10;
    }

    @Override // d0.InterfaceC4289f
    public int c(int i10) {
        do {
            i10 = this.f194563d.o(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f194562c.charAt(i10)));
        return i10;
    }

    @Override // d0.InterfaceC4289f
    public int d(int i10) {
        do {
            i10 = this.f194563d.n(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f194562c.charAt(i10 - 1)));
        return i10;
    }
}
