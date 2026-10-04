package kotlin.io;

import androidx.compose.animation.core.C1610t;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.L0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC4857c;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements InterfaceC5000m<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final File f217740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FileWalkDirection f217741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ed.l<File, Boolean> f217742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ed.l<File, L0> f217743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final ed.p<File, IOException, L0> f217744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f217745f;

    @V({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull File rootDir) {
            super(rootDir);
            G.p(rootDir, "rootDir");
        }
    }

    public final class b extends AbstractC4857c<File> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayDeque<c> f217746c;

        public final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f217748b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public File[] f217749c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f217750d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f217751e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f217752f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull b bVar, File rootDir) {
                super(rootDir);
                G.p(rootDir, "rootDir");
                this.f217752f = bVar;
            }

            @Override // kotlin.io.h.c
            @Nullable
            public File b() {
                if (!this.f217751e && this.f217749c == null) {
                    ed.l<File, Boolean> lVar = h.this.f217742c;
                    if (lVar != null && !lVar.invoke(this.f217760a).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = this.f217760a.listFiles();
                    this.f217749c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        ed.p<File, IOException, L0> pVar = h.this.f217744e;
                        if (pVar != null) {
                            pVar.invoke(this.f217760a, new AccessDeniedException(this.f217760a, null, "Cannot list files in a directory", 2, null));
                        }
                        this.f217751e = true;
                    }
                }
                File[] fileArr = this.f217749c;
                if (fileArr != null) {
                    int i10 = this.f217750d;
                    G.m(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f217749c;
                        G.m(fileArr2);
                        int i11 = this.f217750d;
                        this.f217750d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f217748b) {
                    this.f217748b = true;
                    return this.f217760a;
                }
                ed.l<File, L0> lVar2 = h.this.f217743d;
                if (lVar2 != null) {
                    lVar2.invoke(this.f217760a);
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: kotlin.io.h$b$b, reason: collision with other inner class name */
        @V({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        public final class C0824b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f217753b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f217754c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0824b(@NotNull b bVar, File rootFile) {
                super(rootFile);
                G.p(rootFile, "rootFile");
                this.f217754c = bVar;
            }

            @Override // kotlin.io.h.c
            @Nullable
            public File b() {
                if (this.f217753b) {
                    return null;
                }
                this.f217753b = true;
                return this.f217760a;
            }
        }

        public final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f217755b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public File[] f217756c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f217757d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f217758e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull b bVar, File rootDir) {
                super(rootDir);
                G.p(rootDir, "rootDir");
                this.f217758e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // kotlin.io.h.c
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File b() {
                /*
                    r9 = this;
                    boolean r0 = r9.f217755b
                    r1 = 0
                    if (r0 != 0) goto L22
                    kotlin.io.h$b r0 = r9.f217758e
                    kotlin.io.h r0 = kotlin.io.h.this
                    ed.l<java.io.File, java.lang.Boolean> r0 = r0.f217742c
                    if (r0 == 0) goto L1c
                    java.io.File r2 = r9.f217760a
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L1c
                    return r1
                L1c:
                    r0 = 1
                    r9.f217755b = r0
                    java.io.File r0 = r9.f217760a
                    return r0
                L22:
                    java.io.File[] r0 = r9.f217756c
                    if (r0 == 0) goto L3d
                    int r2 = r9.f217757d
                    kotlin.jvm.internal.G.m(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L2f
                    goto L3d
                L2f:
                    kotlin.io.h$b r0 = r9.f217758e
                    kotlin.io.h r0 = kotlin.io.h.this
                    ed.l<java.io.File, kotlin.L0> r0 = r0.f217743d
                    if (r0 == 0) goto L3c
                    java.io.File r2 = r9.f217760a
                    r0.invoke(r2)
                L3c:
                    return r1
                L3d:
                    java.io.File[] r0 = r9.f217756c
                    if (r0 != 0) goto L7c
                    java.io.File r0 = r9.f217760a
                    java.io.File[] r0 = r0.listFiles()
                    r9.f217756c = r0
                    if (r0 != 0) goto L64
                    kotlin.io.h$b r0 = r9.f217758e
                    kotlin.io.h r0 = kotlin.io.h.this
                    ed.p<java.io.File, java.io.IOException, kotlin.L0> r0 = r0.f217744e
                    if (r0 == 0) goto L64
                    java.io.File r2 = r9.f217760a
                    kotlin.io.AccessDeniedException r3 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r9.f217760a
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L64:
                    java.io.File[] r0 = r9.f217756c
                    if (r0 == 0) goto L6e
                    kotlin.jvm.internal.G.m(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L7c
                L6e:
                    kotlin.io.h$b r0 = r9.f217758e
                    kotlin.io.h r0 = kotlin.io.h.this
                    ed.l<java.io.File, kotlin.L0> r0 = r0.f217743d
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r9.f217760a
                    r0.invoke(r2)
                L7b:
                    return r1
                L7c:
                    java.io.File[] r0 = r9.f217756c
                    kotlin.jvm.internal.G.m(r0)
                    int r1 = r9.f217757d
                    int r2 = r1 + 1
                    r9.f217757d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.h.b.c.b():java.io.File");
            }
        }

        public static final /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f217759a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f217759a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f217746c = arrayDeque;
            if (h.this.f217740a.isDirectory()) {
                arrayDeque.push(g(h.this.f217740a));
            } else if (h.this.f217740a.isFile()) {
                arrayDeque.push(new C0824b(this, h.this.f217740a));
            } else {
                this.f217599a = 2;
            }
        }

        @Override // kotlin.collections.AbstractC4857c
        public void b() {
            File fileH = h();
            if (fileH != null) {
                e(fileH);
            } else {
                this.f217599a = 2;
            }
        }

        public final a g(File file) {
            int i10 = d.f217759a[h.this.f217741b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final File h() {
            File fileB;
            while (true) {
                c cVarPeek = this.f217746c.peek();
                if (cVarPeek == null) {
                    return null;
                }
                fileB = cVarPeek.b();
                if (fileB == null) {
                    this.f217746c.pop();
                } else {
                    if (fileB.equals(cVarPeek.f217760a) || !fileB.isDirectory() || this.f217746c.size() >= h.this.f217745f) {
                        break;
                    }
                    this.f217746c.push(g(fileB));
                }
            }
            return fileB;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final File f217760a;

        public c(@NotNull File root) {
            G.p(root, "root");
            this.f217760a = root;
        }

        @NotNull
        public final File a() {
            return this.f217760a;
        }

        @Nullable
        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(File file, FileWalkDirection fileWalkDirection, ed.l<? super File, Boolean> lVar, ed.l<? super File, L0> lVar2, ed.p<? super File, ? super IOException, L0> pVar, int i10) {
        this.f217740a = file;
        this.f217741b = fileWalkDirection;
        this.f217742c = lVar;
        this.f217743d = lVar2;
        this.f217744e = pVar;
        this.f217745f = i10;
    }

    @NotNull
    public final h i(int i10) {
        if (i10 > 0) {
            return new h(this.f217740a, this.f217741b, this.f217742c, this.f217743d, this.f217744e, i10);
        }
        throw new IllegalArgumentException(C1610t.a("depth must be positive, but was ", i10, '.'));
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<File> iterator() {
        return new b();
    }

    @NotNull
    public final h j(@NotNull ed.l<? super File, Boolean> function) {
        G.p(function, "function");
        return new h(this.f217740a, this.f217741b, function, this.f217743d, this.f217744e, this.f217745f);
    }

    @NotNull
    public final h k(@NotNull ed.p<? super File, ? super IOException, L0> function) {
        G.p(function, "function");
        return new h(this.f217740a, this.f217741b, this.f217742c, this.f217743d, function, this.f217745f);
    }

    @NotNull
    public final h l(@NotNull ed.l<? super File, L0> function) {
        G.p(function, "function");
        return new h(this.f217740a, this.f217741b, this.f217742c, function, this.f217744e, this.f217745f);
    }

    public /* synthetic */ h(File file, FileWalkDirection fileWalkDirection, ed.l lVar, ed.l lVar2, ed.p pVar, int i10, int i11, C4969v c4969v) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, lVar, lVar2, pVar, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@NotNull File start, @NotNull FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        G.p(start, "start");
        G.p(direction, "direction");
    }

    public /* synthetic */ h(File file, FileWalkDirection fileWalkDirection, int i10, C4969v c4969v) {
        this(file, (i10 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }
}
