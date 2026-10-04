package N4;

import N4.d;
import N4.l;
import Q4.a;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC1486c;
import com.android.launcher3.IconCache;
import com.gaia.ngallery.GalleryConfig;
import com.gaia.ngallery.model.MediaFile;
import com.gaia.ngallery.ui.DataSettingActivity;
import com.gaia.ngallery.ui.GalleryActivity;
import com.prism.commons.file.FileType;
import com.prism.commons.interfaces.WalkCmd;
import com.prism.commons.utils.I;
import com.prism.commons.utils.c0;
import com.prism.commons.utils.l0;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.PrivateFileSystemConfig;
import com.prism.lib.pfs.file.PrivateFile;
import com.prism.lib.pfs.file.PrivatePath;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import g6.C4455a;
import i5.C4555a;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f59072b = "ngallery";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f59073c = "Trash";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f59074d = "main album";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f59075e = "Recovered";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final String f59077g = ".nomedia";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static GalleryConfig f59078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static PrivateFileSystem f59079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static P4.e f59080j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f59071a = l0.b(d.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f59076f = {"valtGallery", "vGallery"};

    public class a implements PrivateFileSystemConfig.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f59081a = false;

        @Override // com.prism.lib.pfs.PrivateFileSystemConfig.a
        public o6.l<PrivateFile> a() {
            return new o6.l() { // from class: N4.c
                @Override // o6.l
                public final WalkCmd a(Object obj) {
                    return this.f59070a.c((PrivateFile) obj);
                }
            };
        }

        public final /* synthetic */ WalkCmd c(PrivateFile privateFile) {
            if (privateFile.sync(false).isDirectory()) {
                return WalkCmd.INSIDE;
            }
            FileType fileTypeQ = d.q(privateFile);
            if (d.u(fileTypeQ)) {
                I.a(d.f59071a, "validChecker got image");
                this.f59081a = true;
                return WalkCmd.STOP;
            }
            if (!d.x(fileTypeQ)) {
                return WalkCmd.CONTINUE;
            }
            I.a(d.f59071a, "validChecker got video");
            this.f59081a = true;
            return WalkCmd.STOP;
        }

        @Override // com.prism.lib.pfs.PrivateFileSystemConfig.a
        public boolean isValid() {
            return this.f59081a;
        }
    }

    public class b extends T6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f59082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f59083b;

        public b(Context context, int i10) {
            this.f59082a = context;
            this.f59083b = i10;
        }

        @Override // T6.a
        public void b() {
            d.h(this.f59082a, this.f59083b);
        }

        @Override // T6.a
        public void c(int i10) {
            d.h(this.f59082a, this.f59083b);
        }
    }

    public class c extends com.prism.lib.pfs.c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ P4.e f59084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ f f59085g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PrivateFileSystem privateFileSystem, ActivityC1486c activityC1486c, P4.e eVar, f fVar) {
            super(privateFileSystem, activityC1486c);
            this.f59084f = eVar;
            this.f59085g = fVar;
        }

        public static /* synthetic */ void i(final P4.e eVar, final f fVar) {
            eVar.p();
            if (fVar != null) {
                C4455a.b().b().execute(new Runnable() { // from class: N4.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.b(eVar);
                    }
                });
            }
        }

        @Override // o6.g
        public void a() {
            f fVar = this.f59085g;
            if (fVar != null) {
                fVar.a(d.i().getString(l.p.f62898P1));
            }
        }

        @Override // o6.g
        public void onSuccess() {
            g6.i iVarA = C4455a.b().a();
            final P4.e eVar = this.f59084f;
            final f fVar = this.f59085g;
            iVarA.execute(new Runnable() { // from class: N4.e
                @Override // java.lang.Runnable
                public final void run() {
                    d.c.i(eVar, fVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N4.d$d, reason: collision with other inner class name */
    public class C0082d extends com.prism.lib.pfs.c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ P4.e f59086f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ f f59087g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0082d(PrivateFileSystem privateFileSystem, ActivityC1486c activityC1486c, P4.e eVar, f fVar) {
            super(privateFileSystem, activityC1486c);
            this.f59086f = eVar;
            this.f59087g = fVar;
        }

        public static /* synthetic */ void i(final P4.e eVar, final f fVar) {
            eVar.s();
            if (fVar != null) {
                C4455a.b().b().execute(new Runnable() { // from class: N4.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.b(eVar);
                    }
                });
            }
        }

        @Override // o6.g
        public void a() {
            f fVar = this.f59087g;
            if (fVar != null) {
                fVar.a(d.i().getString(l.p.f62898P1));
            }
        }

        @Override // o6.g
        public void onSuccess() {
            g6.i iVarA = C4455a.b().a();
            final P4.e eVar = this.f59086f;
            final f fVar = this.f59087g;
            iVarA.execute(new Runnable() { // from class: N4.g
                @Override // java.lang.Runnable
                public final void run() {
                    d.C0082d.i(eVar, fVar);
                }
            });
        }
    }

    public class e extends com.prism.lib.pfs.c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ o6.f f59088f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PrivateFileSystem privateFileSystem, ActivityC1486c activityC1486c, o6.f fVar) {
            super(privateFileSystem, activityC1486c);
            this.f59088f = fVar;
        }

        @Override // o6.g
        public void a() {
            o6.f fVar = this.f59088f;
            if (fVar != null) {
                fVar.a(d.i().getString(l.p.f62898P1));
            }
        }

        @Override // o6.g
        public void onSuccess() {
            o6.f fVar = this.f59088f;
            if (fVar != null) {
                fVar.onSuccess();
            }
        }
    }

    public interface f {
        void a(String str);

        void b(P4.e eVar);
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f59089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f59090b;
    }

    public static class h implements o6.l<PrivateFile> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f59091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f59092b;

        @Override // o6.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public WalkCmd a(PrivateFile privateFile) {
            if (privateFile.sync(false).isDirectory()) {
                return WalkCmd.INSIDE;
            }
            FileType fileTypeQ = d.q(privateFile);
            if (d.u(fileTypeQ)) {
                this.f59091a++;
            } else if (d.x(fileTypeQ)) {
                this.f59092b++;
            }
            return WalkCmd.CONTINUE;
        }

        public h() {
            this.f59091a = 0;
            this.f59092b = 0;
        }
    }

    public static void A(@NonNull PrivateFileSystem privateFileSystem, @Nullable final o6.j<PrivateFile, Boolean> jVar, @NonNull final o6.j<PrivateFile, Boolean> jVar2, @Nullable o6.k kVar) {
        privateFileSystem.scan(new o6.l() { // from class: N4.b
            @Override // o6.l
            public final WalkCmd a(Object obj) {
                return d.a(jVar, jVar2, (PrivateFile) obj);
            }
        }, kVar);
    }

    public static void B(Context context) {
        E(context, 3);
    }

    public static void C(Context context) {
        E(context, 4);
    }

    public static void D(Context context) {
        E(context, 10);
    }

    public static void E(Context context, int i10) {
        J6.a.f().i(a.C0099a.f65869c, context, null, new b(context, i10));
    }

    public static /* synthetic */ WalkCmd a(o6.j jVar, o6.j jVar2, PrivateFile privateFile) {
        return privateFile.sync(false).isDirectory() ? (jVar == null || ((Boolean) jVar.a(privateFile)).booleanValue()) ? ((PrivatePath.detectPathEncryptType(privateFile.getRealPath()) > 0 || v(privateFile.getName())) && !((Boolean) jVar2.a(privateFile)).booleanValue()) ? WalkCmd.STOP : WalkCmd.INSIDE : WalkCmd.STOP : WalkCmd.CONTINUE;
    }

    public static void d(ActivityC1486c activityC1486c, @NonNull PrivateFile privateFile) throws IOException {
        f59079i = PrivateFileSystem.getInstance(new PrivateFileSystemConfig.Builder().setResidePathForce(f59072b, privateFile.getRealPath()).setRelativeHome("").build());
        f59080j = new P4.e(f59079i.root());
        z(activityC1486c, null);
    }

    public static void e(@NonNull ActivityC1486c activityC1486c, @Nullable o6.f fVar) {
        f59079i.changeMountPath(activityC1486c, new e(f59079i, activityC1486c, fVar));
        f59080j = new P4.e(f59079i.root());
    }

    public static g f(@NonNull PrivateFile privateFile, @Nullable o6.k kVar) {
        I.b(f59071a, "countGallery for dir: %s", privateFile.getRealPath());
        h hVar = new h();
        privateFile.walk(hVar, kVar);
        g gVar = new g();
        gVar.f59089a = hVar.f59091a;
        gVar.f59090b = hVar.f59092b;
        return gVar;
    }

    public static void g(Context context) {
        context.startActivity(new Intent(context, (Class<?>) DataSettingActivity.class));
    }

    public static void h(Context context, int i10) {
        Intent intent = new Intent(context, (Class<?>) GalleryActivity.class);
        intent.putExtra(a.c.f65884m, i10);
        if (!C4555a.e(context)) {
            intent.putExtra(GalleryActivity.f150381j, f59078h.g());
            C4555a.g(context, true);
        }
        context.startActivity(intent);
    }

    public static Context i() {
        return PrivateFileSystem.getAppContext();
    }

    public static String j() {
        return PrivateFileSystem.getTempExportAuth();
    }

    public static File k() {
        return new File(PrivateFileSystem.getTempExportPath());
    }

    public static GalleryConfig l() {
        return f59078h;
    }

    public static P4.e m() {
        return f59080j;
    }

    @SuppressLint({"CheckResult"})
    public static com.bumptech.glide.j<Drawable> n(int i10, boolean z10) {
        com.bumptech.glide.request.h hVar = new com.bumptech.glide.request.h();
        if (z10) {
            hVar.D();
        } else {
            hVar.g();
        }
        return com.bumptech.glide.c.F(PrivateFileSystem.getAppContext()).p(Integer.valueOf(i10)).d(hVar);
    }

    @SuppressLint({"CheckResult"})
    public static com.bumptech.glide.j<Drawable> o(MediaFile mediaFile, boolean z10, boolean z11) {
        com.bumptech.glide.request.h hVar = new com.bumptech.glide.request.h();
        if (z10) {
            hVar.D();
        } else {
            hVar.g();
        }
        hVar.t(com.bumptech.glide.load.engine.h.f139670b);
        float rotation = z11 ? mediaFile.getRotation() * 90 : 0.0f;
        com.bumptech.glide.j<Drawable> seekableIconGlideRequest = PrivateFileSystem.getSeekableIconGlideRequest(mediaFile.getFile());
        seekableIconGlideRequest.d(hVar);
        if (rotation > 0.0f) {
            seekableIconGlideRequest.R0(new S4.b(rotation));
        }
        return seekableIconGlideRequest;
    }

    @SuppressLint({"CheckResult"})
    public static com.bumptech.glide.j<Drawable> p(ExchangeFile exchangeFile, boolean z10) {
        com.bumptech.glide.request.h hVar = new com.bumptech.glide.request.h();
        if (z10) {
            hVar.D();
        } else {
            hVar.g();
        }
        return PrivateFileSystem.getSeekableIconGlideRequest(exchangeFile).d(hVar);
    }

    public static FileType q(PrivateFile privateFile) {
        FileType type = privateFile.getType();
        return (type == FileType.UNKNOWN && !privateFile.getName().startsWith(IconCache.EMPTY_CLASS_NAME)) ? privateFile.resolveTypeByContent() : type;
    }

    public static PrivateFileSystem r() {
        return f59079i;
    }

    public static PrivateFileSystem s() {
        return PrivateFileSystem.getExportDefault();
    }

    public static void t(Application application, GalleryConfig galleryConfig) {
        if (f59078h == null) {
            f59078h = galleryConfig;
        }
        Da.b.d(application);
        PrivateFileSystem.init(application);
        if (f59079i == null) {
            try {
                String strB = C4555a.b(application, galleryConfig.b());
                PrivateFileSystemConfig.Builder builder = new PrivateFileSystemConfig.Builder();
                PrivateFileSystemConfig privateFileSystemConfigBuild = builder.setResidePath(f59072b, strB).setRelativeHome(new File(builder.getResidePath()).getName()).addFlags(1).withEventLoggerFactory(galleryConfig.e()).build();
                privateFileSystemConfigBuild.f183653h = new a();
                f59079i = PrivateFileSystem.getInstance(privateFileSystemConfigBuild);
                c0.b().d("Gallery.residePath", f59079i.getTargetResidePath());
            } catch (IOException unused) {
            }
        }
        if (f59080j == null) {
            f59080j = new P4.e(f59079i.root());
        }
        V4.a.f74615b.c(application);
    }

    public static boolean u(FileType fileType) {
        return fileType == FileType.IMAGE;
    }

    public static boolean v(String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : f59076f) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean w(FileType fileType) {
        return fileType == FileType.IMAGE || fileType == FileType.VIDEO || fileType == FileType.AUDIO;
    }

    public static boolean x(FileType fileType) {
        return fileType == FileType.VIDEO || fileType == FileType.AUDIO;
    }

    public static void y(@NonNull ActivityC1486c activityC1486c, @Nullable f fVar) {
        f59079i.mount(activityC1486c, new c(f59079i, activityC1486c, f59080j, fVar));
    }

    public static void z(@NonNull ActivityC1486c activityC1486c, @Nullable f fVar) {
        f59079i.mount(activityC1486c, new C0082d(f59079i, activityC1486c, f59080j, fVar));
    }
}
