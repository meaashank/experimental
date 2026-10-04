package androidx.compose.ui.graphics.layer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.collection.G0;
import androidx.collection.MutableScatterSet;
import androidx.collection.T0;
import androidx.compose.ui.graphics.D0;
import androidx.core.os.C2411j;
import java.util.Locale;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLayerManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerManager.android.kt\nandroidx/compose/ui/graphics/layer/LayerManager\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,168:1\n1580#2:169\n1#3:170\n47#4,3:171\n50#4,2:201\n267#5,4:174\n237#5,7:178\n248#5,3:186\n251#5,2:190\n272#5,2:192\n254#5,6:194\n274#5:200\n1810#6:185\n1672#6:189\n305#7,6:203\n*S KotlinDebug\n*F\n+ 1 LayerManager.android.kt\nandroidx/compose/ui/graphics/layer/LayerManager\n*L\n82#1:169\n123#1:171,3\n123#1:201,2\n126#1:174,4\n126#1:178,7\n126#1:186,3\n126#1:190,2\n126#1:192,2\n126#1:194,6\n126#1:200\n126#1:185\n126#1:189\n132#1:203,6\n*E\n"})
public final class H {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f101252g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f101253h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final D0 f101254a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ImageReader f101256c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public G0<GraphicsLayer> f101258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f101259f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableScatterSet<GraphicsLayer> f101255b = T0.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Handler f101257d = C2411j.b(Looper.getMainLooper(), new Handler.Callback() { // from class: androidx.compose.ui.graphics.layer.G
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            H.b(this.f101216a, message);
            return true;
        }
    });

    public static final class a {
        public a() {
        }

        public final boolean a() {
            return H.f101253h;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.G.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f101253h = lowerCase.equals("robolectric");
    }

    public H(@NotNull D0 d02) {
        this.f101254a = d02;
    }

    public static /* synthetic */ boolean b(H h10, Message message) {
        f(h10, message);
        return true;
    }

    public static final boolean f(H h10, Message message) {
        h10.i(h10.f101255b);
        return true;
    }

    public static final void j(ImageReader imageReader) {
        Image imageAcquireLatestImage;
        if (imageReader == null || (imageAcquireLatestImage = imageReader.acquireLatestImage()) == null) {
            return;
        }
        imageAcquireLatestImage.close();
    }

    public final void d() {
        ImageReader imageReader = this.f101256c;
        if (imageReader != null) {
            imageReader.close();
        }
        this.f101256c = null;
    }

    @NotNull
    public final D0 e() {
        return this.f101254a;
    }

    public final boolean g() {
        return this.f101256c != null;
    }

    public final void h(@NotNull GraphicsLayer graphicsLayer) {
        this.f101255b.C(graphicsLayer);
        if (this.f101257d.hasMessages(0)) {
            return;
        }
        this.f101257d.sendMessageAtFrontOfQueue(Message.obtain());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(androidx.collection.ScatterSet<androidx.compose.ui.graphics.layer.GraphicsLayer> r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r1.s()
            if (r2 == 0) goto Lb4
            boolean r2 = androidx.compose.ui.graphics.layer.H.f101253h
            if (r2 != 0) goto Lb4
            android.media.ImageReader r2 = r0.f101256c
            r3 = 1
            if (r2 != 0) goto L24
            r2 = 3
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r3, r3, r3, r2)
            androidx.compose.ui.graphics.layer.F r4 = new androidx.compose.ui.graphics.layer.F
            r4.<init>()
            android.os.Handler r5 = r0.f101257d
            r2.setOnImageAvailableListener(r4, r5)
            r0.f101256c = r2
        L24:
            android.view.Surface r2 = r2.getSurface()
            androidx.compose.ui.graphics.layer.N r4 = androidx.compose.ui.graphics.layer.N.f101273a
            android.graphics.Canvas r4 = r4.a(r2)
            r0.f101259f = r3
            androidx.compose.ui.graphics.D0 r5 = r0.f101254a
            androidx.compose.ui.graphics.G r6 = r5.f100679a
            android.graphics.Canvas r7 = r6.f100692a
            r6.f100692a = r4
            r4.save()
            r8 = 0
            r4.clipRect(r8, r8, r3, r3)
            java.lang.Object[] r3 = r1.f86877b
            long[] r1 = r1.f86876a
            int r9 = r1.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto L89
            r10 = r8
        L49:
            r11 = r1[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L83
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = r8
        L63:
            if (r15 >= r13) goto L81
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L7c
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r3[r16]
            r8 = r16
            androidx.compose.ui.graphics.layer.GraphicsLayer r8 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r8
            r8.i(r6)
        L7c:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            r8 = 0
            goto L63
        L81:
            if (r13 != r14) goto L89
        L83:
            if (r10 == r9) goto L89
            int r10 = r10 + 1
            r8 = 0
            goto L49
        L89:
            r4.restore()
            androidx.compose.ui.graphics.G r1 = r5.f100679a
            r1.f100692a = r7
            r1 = 0
            r0.f101259f = r1
            androidx.collection.G0<androidx.compose.ui.graphics.layer.GraphicsLayer> r3 = r0.f101258e
            if (r3 == 0) goto Lb1
            boolean r5 = r3.I()
            if (r5 == 0) goto Lb1
            java.lang.Object[] r5 = r3.f86809a
            int r6 = r3.f86810b
            r8 = r1
        La2:
            if (r8 >= r6) goto Lae
            r1 = r5[r8]
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r1
            r0.k(r1)
            int r8 = r8 + 1
            goto La2
        Lae:
            r3.k0()
        Lb1:
            r2.unlockCanvasAndPost(r4)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.H.i(androidx.collection.ScatterSet):void");
    }

    public final void k(@NotNull GraphicsLayer graphicsLayer) {
        if (!this.f101259f) {
            if (this.f101255b.d0(graphicsLayer)) {
                graphicsLayer.g();
            }
        } else {
            G0<GraphicsLayer> g02 = this.f101258e;
            if (g02 == null) {
                g02 = new G0<>(0, 1, null);
                this.f101258e = g02;
            }
            g02.Z(graphicsLayer);
        }
    }

    public final void l() {
        d();
        i(this.f101255b);
    }
}
