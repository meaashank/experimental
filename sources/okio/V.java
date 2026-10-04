package okio;

import com.android.launcher3.IconCache;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class V implements Comparable<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f225882b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final String f225883c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ByteString f225884a;

    public static final class a {
        public a() {
        }

        public static /* synthetic */ V g(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(file, z10);
        }

        public static /* synthetic */ V h(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.d(str, z10);
        }

        public static /* synthetic */ V i(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.f(path, z10);
        }

        @dd.o
        @dd.j(name = w7.i.f240158w)
        @NotNull
        @dd.k
        public final V a(@NotNull File file) {
            kotlin.jvm.internal.G.p(file, "<this>");
            return b(file, false);
        }

        @dd.o
        @dd.j(name = w7.i.f240158w)
        @NotNull
        @dd.k
        public final V b(@NotNull File file, boolean z10) {
            kotlin.jvm.internal.G.p(file, "<this>");
            String string = file.toString();
            kotlin.jvm.internal.G.o(string, "toString()");
            return okio.internal.f.B(string, z10);
        }

        @dd.o
        @dd.j(name = w7.i.f240158w)
        @NotNull
        @dd.k
        public final V c(@NotNull String str) {
            kotlin.jvm.internal.G.p(str, "<this>");
            return d(str, false);
        }

        @dd.o
        @dd.j(name = w7.i.f240158w)
        @NotNull
        @dd.k
        public final V d(@NotNull String str, boolean z10) {
            kotlin.jvm.internal.G.p(str, "<this>");
            return okio.internal.f.B(str, z10);
        }

        @dd.o
        @dd.j(name = w7.i.f240158w)
        @IgnoreJRERequirement
        @NotNull
        @dd.k
        public final V e(@NotNull Path path) {
            kotlin.jvm.internal.G.p(path, "<this>");
            return f(path, false);
        }

        @dd.o
        @dd.j(name = w7.i.f240158w)
        @IgnoreJRERequirement
        @NotNull
        @dd.k
        public final V f(@NotNull Path path, boolean z10) {
            kotlin.jvm.internal.G.p(path, "<this>");
            return d(path.toString(), z10);
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        String separator = File.separator;
        kotlin.jvm.internal.G.o(separator, "separator");
        f225883c = separator;
    }

    public V(@NotNull ByteString bytes) {
        kotlin.jvm.internal.G.p(bytes, "bytes");
        this.f225884a = bytes;
    }

    public static /* synthetic */ V A(V v10, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return v10.v(str, z10);
    }

    public static /* synthetic */ V B(V v10, ByteString byteString, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return v10.x(byteString, z10);
    }

    public static /* synthetic */ V C(V v10, V v11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return v10.z(v11, z10);
    }

    @dd.o
    @dd.j(name = w7.i.f240158w)
    @NotNull
    @dd.k
    public static final V b(@NotNull File file) {
        return f225882b.a(file);
    }

    @dd.o
    @dd.j(name = w7.i.f240158w)
    @NotNull
    @dd.k
    public static final V c(@NotNull File file, boolean z10) {
        return f225882b.b(file, z10);
    }

    @dd.o
    @dd.j(name = w7.i.f240158w)
    @NotNull
    @dd.k
    public static final V d(@NotNull String str) {
        return f225882b.c(str);
    }

    @dd.o
    @dd.j(name = w7.i.f240158w)
    @NotNull
    @dd.k
    public static final V e(@NotNull String str, boolean z10) {
        return f225882b.d(str, z10);
    }

    @dd.o
    @dd.j(name = w7.i.f240158w)
    @IgnoreJRERequirement
    @NotNull
    @dd.k
    public static final V f(@NotNull Path path) {
        return f225882b.e(path);
    }

    @dd.o
    @dd.j(name = w7.i.f240158w)
    @IgnoreJRERequirement
    @NotNull
    @dd.k
    public static final V g(@NotNull Path path, boolean z10) {
        return f225882b.f(path, z10);
    }

    @IgnoreJRERequirement
    @NotNull
    public final Path D() {
        Path path = Paths.get(this.f225884a.s0(), new String[0]);
        kotlin.jvm.internal.G.o(path, "get(toString())");
        return path;
    }

    @dd.j(name = "volumeLetter")
    @Nullable
    public final Character E() {
        if (ByteString.J(this.f225884a, okio.internal.f.f226045a, 0, 2, null) != -1 || this.f225884a.y() < 2 || this.f225884a.M(1) != ((byte) 58)) {
            return null;
        }
        char cM = (char) this.f225884a.M(0);
        if (('a' > cM || cM >= '{') && ('A' > cM || cM >= '[')) {
            return null;
        }
        return Character.valueOf(cM);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull V other) {
        kotlin.jvm.internal.G.p(other, "other");
        return this.f225884a.compareTo(other.f225884a);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof V) && kotlin.jvm.internal.G.g(((V) obj).f225884a, this.f225884a);
    }

    @NotNull
    public final ByteString h() {
        return this.f225884a;
    }

    public int hashCode() {
        return this.f225884a.hashCode();
    }

    @Nullable
    public final V i() {
        int iM = okio.internal.f.M(this);
        if (iM == -1) {
            return null;
        }
        return new V(this.f225884a.n0(0, iM));
    }

    public final boolean isAbsolute() {
        return okio.internal.f.M(this) != -1;
    }

    @NotNull
    public final List<String> j() {
        ArrayList arrayList = new ArrayList();
        int iM = okio.internal.f.M(this);
        int i10 = 0;
        if (iM == -1) {
            iM = 0;
        } else if (iM < this.f225884a.y() && this.f225884a.M(iM) == ((byte) 92)) {
            iM++;
        }
        int iY = this.f225884a.y();
        int i11 = iM;
        while (iM < iY) {
            if (this.f225884a.M(iM) == ((byte) 47) || this.f225884a.M(iM) == ((byte) 92)) {
                arrayList.add(this.f225884a.n0(i11, iM));
                i11 = iM + 1;
            }
            iM++;
        }
        if (i11 < this.f225884a.y()) {
            ByteString byteString = this.f225884a;
            arrayList.add(byteString.n0(i11, byteString.y()));
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.J.d0(arrayList, 10));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            arrayList2.add(((ByteString) obj).s0());
        }
        return arrayList2;
    }

    @NotNull
    public final List<ByteString> k() {
        ArrayList arrayList = new ArrayList();
        int iM = okio.internal.f.M(this);
        if (iM == -1) {
            iM = 0;
        } else if (iM < this.f225884a.y() && this.f225884a.M(iM) == ((byte) 92)) {
            iM++;
        }
        int iY = this.f225884a.y();
        int i10 = iM;
        while (iM < iY) {
            if (this.f225884a.M(iM) == ((byte) 47) || this.f225884a.M(iM) == ((byte) 92)) {
                arrayList.add(this.f225884a.n0(i10, iM));
                i10 = iM + 1;
            }
            iM++;
        }
        if (i10 < this.f225884a.y()) {
            ByteString byteString = this.f225884a;
            arrayList.add(byteString.n0(i10, byteString.y()));
        }
        return arrayList;
    }

    public final boolean l() {
        return okio.internal.f.M(this) == -1;
    }

    public final boolean m() {
        return okio.internal.f.M(this) == this.f225884a.y();
    }

    @dd.j(name = "name")
    @NotNull
    public final String n() {
        return p().s0();
    }

    @dd.j(name = "nameBytes")
    @NotNull
    public final ByteString p() {
        int I10 = okio.internal.f.I(this);
        return I10 != -1 ? ByteString.o0(this.f225884a, I10 + 1, 0, 2, null) : (E() == null || this.f225884a.y() != 2) ? this.f225884a : ByteString.f225867e;
    }

    @NotNull
    public final V r() {
        a aVar = f225882b;
        String strS0 = this.f225884a.s0();
        aVar.getClass();
        return okio.internal.f.B(strS0, true);
    }

    @dd.j(name = androidx.constraintlayout.widget.d.f107893V1)
    @Nullable
    public final V s() {
        if (!kotlin.jvm.internal.G.g(this.f225884a, okio.internal.f.f226048d) && !kotlin.jvm.internal.G.g(this.f225884a, okio.internal.f.f226045a)) {
            ByteString byteString = this.f225884a;
            ByteString byteString2 = okio.internal.f.f226046b;
            if (!kotlin.jvm.internal.G.g(byteString, byteString2) && !okio.internal.f.L(this)) {
                int I10 = okio.internal.f.I(this);
                if (I10 == 2 && E() != null) {
                    if (this.f225884a.y() == 3) {
                        return null;
                    }
                    return new V(ByteString.o0(this.f225884a, 0, 3, 1, null));
                }
                if (I10 == 1 && this.f225884a.i0(byteString2)) {
                    return null;
                }
                if (I10 != -1 || E() == null) {
                    return I10 == -1 ? new V(okio.internal.f.f226048d) : I10 == 0 ? new V(ByteString.o0(this.f225884a, 0, 1, 1, null)) : new V(ByteString.o0(this.f225884a, 0, I10, 1, null));
                }
                if (this.f225884a.y() == 2) {
                    return null;
                }
                return new V(ByteString.o0(this.f225884a, 0, 2, 1, null));
            }
        }
        return null;
    }

    @NotNull
    public final V t(@NotNull V other) {
        kotlin.jvm.internal.G.p(other, "other");
        if (!kotlin.jvm.internal.G.g(i(), other.i())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList arrayList = (ArrayList) k();
        ArrayList arrayList2 = (ArrayList) other.k();
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        int i10 = 0;
        while (i10 < iMin && kotlin.jvm.internal.G.g(arrayList.get(i10), arrayList2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && this.f225884a.y() == other.f225884a.y()) {
            return a.h(f225882b, IconCache.EMPTY_CLASS_NAME, false, 1, null);
        }
        if (arrayList2.subList(i10, arrayList2.size()).indexOf(okio.internal.f.f226049e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        C5360j c5360j = new C5360j();
        ByteString byteStringK = okio.internal.f.K(other);
        if (byteStringK == null && (byteStringK = okio.internal.f.K(this)) == null) {
            byteStringK = okio.internal.f.Q(f225883c);
        }
        int size = arrayList2.size();
        for (int i11 = i10; i11 < size; i11++) {
            c5360j.v3(okio.internal.f.f226049e);
            c5360j.v3(byteStringK);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            c5360j.v3((ByteString) arrayList.get(i10));
            c5360j.v3(byteStringK);
            i10++;
        }
        return okio.internal.f.O(c5360j, false);
    }

    @NotNull
    public final File toFile() {
        return new File(this.f225884a.s0());
    }

    @NotNull
    public String toString() {
        return this.f225884a.s0();
    }

    @dd.j(name = "resolve")
    @NotNull
    public final V u(@NotNull String child) {
        kotlin.jvm.internal.G.p(child, "child");
        C5360j c5360j = new C5360j();
        c5360j.m4(child);
        return okio.internal.f.x(this, okio.internal.f.O(c5360j, false), false);
    }

    @NotNull
    public final V v(@NotNull String child, boolean z10) {
        kotlin.jvm.internal.G.p(child, "child");
        C5360j c5360j = new C5360j();
        c5360j.m4(child);
        return okio.internal.f.x(this, okio.internal.f.O(c5360j, false), z10);
    }

    @dd.j(name = "resolve")
    @NotNull
    public final V w(@NotNull ByteString child) {
        kotlin.jvm.internal.G.p(child, "child");
        C5360j c5360j = new C5360j();
        c5360j.v3(child);
        return okio.internal.f.x(this, okio.internal.f.O(c5360j, false), false);
    }

    @NotNull
    public final V x(@NotNull ByteString child, boolean z10) {
        kotlin.jvm.internal.G.p(child, "child");
        C5360j c5360j = new C5360j();
        c5360j.v3(child);
        return okio.internal.f.x(this, okio.internal.f.O(c5360j, false), z10);
    }

    @dd.j(name = "resolve")
    @NotNull
    public final V y(@NotNull V child) {
        kotlin.jvm.internal.G.p(child, "child");
        return okio.internal.f.x(this, child, false);
    }

    @NotNull
    public final V z(@NotNull V child, boolean z10) {
        kotlin.jvm.internal.G.p(child, "child");
        return okio.internal.f.x(this, child, z10);
    }
}
