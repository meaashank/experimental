package md;

import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC5043v;
import kotlin.O0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: md.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5227c extends C5225a implements g<Character>, r<Character> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f221128e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final C5227c f221129f = new C5227c(1, 0, 1);

    /* JADX INFO: renamed from: md.c$a */
    public static final class a {
        public a() {
        }

        @NotNull
        public final C5227c a() {
            return C5227c.f221129f;
        }

        public a(C4969v c4969v) {
        }
    }

    public C5227c(char c10, char c11) {
        super(c10, c11, 1);
    }

    @NotNull
    public Character A() {
        return Character.valueOf(this.f221122b);
    }

    @NotNull
    public Character B() {
        return Character.valueOf(this.f221121a);
    }

    @Override // md.g
    public Comparable b() {
        return Character.valueOf(this.f221121a);
    }

    @Override // md.g
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return w(((Character) comparable).charValue());
    }

    @Override // md.C5225a
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C5227c)) {
            return false;
        }
        if (isEmpty() && ((C5227c) obj).isEmpty()) {
            return true;
        }
        C5227c c5227c = (C5227c) obj;
        return this.f221121a == c5227c.f221121a && this.f221122b == c5227c.f221122b;
    }

    @Override // md.g
    public Comparable h() {
        return Character.valueOf(this.f221122b);
    }

    @Override // md.C5225a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f221121a * 31) + this.f221122b;
    }

    @Override // md.C5225a, md.g
    public boolean isEmpty() {
        return G.t(this.f221121a, this.f221122b) > 0;
    }

    @Override // md.C5225a
    @NotNull
    public String toString() {
        return this.f221121a + ".." + this.f221122b;
    }

    public boolean w(char c10) {
        return G.t(this.f221121a, c10) <= 0 && G.t(c10, this.f221122b) <= 0;
    }

    @Override // md.r
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Character i() {
        char c10 = this.f221122b;
        if (c10 != 65535) {
            return Character.valueOf((char) (c10 + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @InterfaceC4887e0(version = "1.9")
    @InterfaceC4982o(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @O0(markerClass = {InterfaceC5043v.class})
    public static /* synthetic */ void z() {
    }
}
