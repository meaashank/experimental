package d;

import B0.C0920d;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.PickVisualMediaRequest;
import d.AbstractC4282a;
import e.InterfaceC4335i;
import e.T;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B;
import kotlin.collections.EmptyList;
import kotlin.collections.U;
import kotlin.collections.m0;
import kotlin.collections.n0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jacoco.core.runtime.AgentOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4283b {

    /* JADX INFO: renamed from: d.b$a */
    public static class a extends AbstractC4282a<Uri, Boolean> {
        @Override // d.AbstractC4282a
        public /* bridge */ /* synthetic */ AbstractC4282a.C0707a<Boolean> b(Context context, Uri uri) {
            e(context, uri);
            return null;
        }

        @Override // d.AbstractC4282a
        @InterfaceC4335i
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @NotNull Uri input) {
            G.p(context, "context");
            G.p(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra(AgentOptions.OUTPUT, input);
            G.o(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Nullable
        public final AbstractC4282a.C0707a<Boolean> e(@NotNull Context context, @NotNull Uri input) {
            G.p(context, "context");
            G.p(input, "input");
            return null;
        }

        @Override // d.AbstractC4282a
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Boolean c(int i10, @Nullable Intent intent) {
            return Boolean.valueOf(i10 == -1);
        }
    }

    /* JADX INFO: renamed from: d.b$c */
    @V({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class c extends AbstractC4282a<String, Uri> {
        @Override // d.AbstractC4282a
        public /* bridge */ /* synthetic */ AbstractC4282a.C0707a<Uri> b(Context context, String str) {
            e(context, str);
            return null;
        }

        @Override // d.AbstractC4282a
        @InterfaceC4335i
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @NotNull String input) {
            G.p(context, "context");
            G.p(input, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            G.o(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        @Nullable
        public final AbstractC4282a.C0707a<Uri> e(@NotNull Context context, @NotNull String input) {
            G.p(context, "context");
            G.p(input, "input");
            return null;
        }

        @Override // d.AbstractC4282a
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: d.b$d */
    @T(18)
    public static class d extends AbstractC4282a<String, List<Uri>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f194518a = new a();

        /* JADX INFO: renamed from: d.b$d$a */
        @T(18)
        public static final class a {
            public a() {
            }

            @NotNull
            public final List<Uri> a(@NotNull Intent intent) {
                G.p(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return EmptyList.f217510a;
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i10 = 0; i10 < itemCount; i10++) {
                        Uri uri = clipData.getItemAt(i10).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            public a(C4969v c4969v) {
            }
        }

        @Override // d.AbstractC4282a
        public /* bridge */ /* synthetic */ AbstractC4282a.C0707a<List<Uri>> b(Context context, String str) {
            e(context, str);
            return null;
        }

        @Override // d.AbstractC4282a
        @InterfaceC4335i
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @NotNull String input) {
            G.p(context, "context");
            G.p(input, "input");
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            G.o(intentPutExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return intentPutExtra;
        }

        @Nullable
        public final AbstractC4282a.C0707a<List<Uri>> e(@NotNull Context context, @NotNull String input) {
            G.p(context, "context");
            G.p(input, "input");
            return null;
        }

        @Override // d.AbstractC4282a
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i10, @Nullable Intent intent) {
            List<Uri> listA;
            if (i10 != -1) {
                intent = null;
            }
            return (intent == null || (listA = f194518a.a(intent)) == null) ? EmptyList.f217510a : listA;
        }
    }

    /* JADX INFO: renamed from: d.b$e */
    @T(19)
    @V({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class e extends AbstractC4282a<String[], Uri> {
        @Override // d.AbstractC4282a
        public /* bridge */ /* synthetic */ AbstractC4282a.C0707a<Uri> b(Context context, String[] strArr) {
            e(context, strArr);
            return null;
        }

        @Override // d.AbstractC4282a
        @InterfaceC4335i
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @NotNull String[] input) {
            G.p(context, "context");
            G.p(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
            G.o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Nullable
        public final AbstractC4282a.C0707a<Uri> e(@NotNull Context context, @NotNull String[] input) {
            G.p(context, "context");
            G.p(input, "input");
            return null;
        }

        @Override // d.AbstractC4282a
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: d.b$f */
    @T(21)
    @V({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class f extends AbstractC4282a<Uri, Uri> {
        @Override // d.AbstractC4282a
        public /* bridge */ /* synthetic */ AbstractC4282a.C0707a<Uri> b(Context context, Uri uri) {
            e(context, uri);
            return null;
        }

        @Override // d.AbstractC4282a
        @InterfaceC4335i
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @Nullable Uri uri) {
            G.p(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        @Nullable
        public final AbstractC4282a.C0707a<Uri> e(@NotNull Context context, @Nullable Uri uri) {
            G.p(context, "context");
            return null;
        }

        @Override // d.AbstractC4282a
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: d.b$g */
    @T(19)
    public static class g extends AbstractC4282a<String[], List<Uri>> {
        @Override // d.AbstractC4282a
        public /* bridge */ /* synthetic */ AbstractC4282a.C0707a<List<Uri>> b(Context context, String[] strArr) {
            e(context, strArr);
            return null;
        }

        @Override // d.AbstractC4282a
        @InterfaceC4335i
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @NotNull String[] input) {
            G.p(context, "context");
            G.p(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            G.o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Nullable
        public final AbstractC4282a.C0707a<List<Uri>> e(@NotNull Context context, @NotNull String[] input) {
            G.p(context, "context");
            G.p(input, "input");
            return null;
        }

        @Override // d.AbstractC4282a
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i10, @Nullable Intent intent) {
            List<Uri> listA;
            if (i10 != -1) {
                intent = null;
            }
            return (intent == null || (listA = d.f194518a.a(intent)) == null) ? EmptyList.f217510a : listA;
        }
    }

    /* JADX INFO: renamed from: d.b$h */
    @V({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickContact\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static final class h extends AbstractC4282a<Void, Uri> {
        @Override // d.AbstractC4282a
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @Nullable Void r22) {
            G.p(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            G.o(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        @Override // d.AbstractC4282a
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Uri c(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: d.b$i */
    @T(19)
    public static class i extends AbstractC4282a<PickVisualMediaRequest, List<Uri>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f194519b = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f194520a;

        /* JADX INFO: renamed from: d.b$i$a */
        public static final class a {
            public a() {
            }

            @SuppressLint({"NewApi", "ClassVerificationFailure"})
            public final int a() {
                if (j.f194521a.j()) {
                    return MediaStore.getPickImagesMaxLimit();
                }
                return Integer.MAX_VALUE;
            }

            public a(C4969v c4969v) {
            }
        }

        public i() {
            this(0, 1, null);
        }

        @Override // d.AbstractC4282a
        public /* bridge */ /* synthetic */ AbstractC4282a.C0707a<List<Uri>> b(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            e(context, pickVisualMediaRequest);
            return null;
        }

        @Override // d.AbstractC4282a
        @InterfaceC4335i
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @NotNull PickVisualMediaRequest input) {
            G.p(context, "context");
            G.p(input, "input");
            j.a aVar = j.f194521a;
            if (aVar.j()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.e(input.f85045a));
                if (this.f194520a > MediaStore.getPickImagesMaxLimit()) {
                    throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f194520a);
                return intent;
            }
            if (aVar.i(context)) {
                ResolveInfo resolveInfoD = aVar.d(context);
                if (resolveInfoD == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo = resolveInfoD.activityInfo;
                Intent intent2 = new Intent(j.f194522b);
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(aVar.e(input.f85045a));
                intent2.putExtra(j.f194525e, this.f194520a);
                return intent2;
            }
            if (!aVar.f(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(aVar.e(input.f85045a));
                intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent3.getType() == null) {
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent3;
            }
            ResolveInfo resolveInfoC = aVar.c(context);
            if (resolveInfoC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = resolveInfoC.activityInfo;
            Intent intent4 = new Intent(j.f194524d);
            intent4.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent4.putExtra(j.f194525e, this.f194520a);
            return intent4;
        }

        @Nullable
        public final AbstractC4282a.C0707a<List<Uri>> e(@NotNull Context context, @NotNull PickVisualMediaRequest input) {
            G.p(context, "context");
            G.p(input, "input");
            return null;
        }

        @Override // d.AbstractC4282a
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i10, @Nullable Intent intent) {
            List<Uri> listA;
            if (i10 != -1) {
                intent = null;
            }
            return (intent == null || (listA = d.f194518a.a(intent)) == null) ? EmptyList.f217510a : listA;
        }

        public i(int i10) {
            this.f194520a = i10;
            if (i10 <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1");
            }
        }

        public /* synthetic */ i(int i10, int i11, C4969v c4969v) {
            this((i11 & 1) != 0 ? f194519b.a() : i10);
        }
    }

    /* JADX INFO: renamed from: d.b$j */
    @T(19)
    @V({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class j extends AbstractC4282a<PickVisualMediaRequest, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f194521a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f194522b = "androidx.activity.result.contract.action.PICK_IMAGES";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f194523c = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f194524d = "com.google.android.gms.provider.action.PICK_IMAGES";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f194525e = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* JADX INFO: renamed from: d.b$j$a */
        public static final class a {
            public a() {
            }

            @dd.o
            @Nullable
            public final ResolveInfo c(@NotNull Context context) {
                G.p(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(j.f194524d), 1114112);
            }

            @dd.o
            @Nullable
            public final ResolveInfo d(@NotNull Context context) {
                G.p(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(j.f194522b), 1114112);
            }

            @Nullable
            public final String e(@NotNull f input) {
                G.p(input, "input");
                if (input instanceof c) {
                    return "image/*";
                }
                if (input instanceof e) {
                    return "video/*";
                }
                if (input instanceof d) {
                    return ((d) input).f194528a;
                }
                if (input instanceof C0709b) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }

            @dd.o
            public final boolean f(@NotNull Context context) {
                G.p(context, "context");
                return c(context) != null;
            }

            @dd.o
            @InterfaceC4982o(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @InterfaceC4852c0(expression = "isPhotoPickerAvailable(context)", imports = {}))
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean g() {
                return j();
            }

            @dd.o
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean h(@NotNull Context context) {
                G.p(context, "context");
                return j() || i(context) || f(context);
            }

            @dd.o
            public final boolean i(@NotNull Context context) {
                G.p(context, "context");
                return d(context) != null;
            }

            @dd.o
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean j() {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    return true;
                }
                return i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
            }

            public a(C4969v c4969v) {
            }

            public static /* synthetic */ void a() {
            }

            public static /* synthetic */ void b() {
            }
        }

        /* JADX INFO: renamed from: d.b$j$b, reason: collision with other inner class name */
        public static final class C0709b implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0709b f194526a = new C0709b();
        }

        /* JADX INFO: renamed from: d.b$j$c */
        public static final class c implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f194527a = new c();
        }

        /* JADX INFO: renamed from: d.b$j$d */
        public static final class d implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f194528a;

            public d(@NotNull String mimeType) {
                G.p(mimeType, "mimeType");
                this.f194528a = mimeType;
            }

            @NotNull
            public final String a() {
                return this.f194528a;
            }
        }

        /* JADX INFO: renamed from: d.b$j$e */
        public static final class e implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f194529a = new e();
        }

        /* JADX INFO: renamed from: d.b$j$f */
        public interface f {
        }

        @dd.o
        @Nullable
        public static final ResolveInfo e(@NotNull Context context) {
            return f194521a.c(context);
        }

        @dd.o
        @Nullable
        public static final ResolveInfo g(@NotNull Context context) {
            return f194521a.d(context);
        }

        @dd.o
        public static final boolean h(@NotNull Context context) {
            return f194521a.f(context);
        }

        @dd.o
        @InterfaceC4982o(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @InterfaceC4852c0(expression = "isPhotoPickerAvailable(context)", imports = {}))
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean i() {
            return f194521a.j();
        }

        @dd.o
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean j(@NotNull Context context) {
            return f194521a.h(context);
        }

        @dd.o
        public static final boolean k(@NotNull Context context) {
            return f194521a.i(context);
        }

        @dd.o
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean l() {
            return f194521a.j();
        }

        @Override // d.AbstractC4282a
        public /* bridge */ /* synthetic */ AbstractC4282a.C0707a<Uri> b(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            f(context, pickVisualMediaRequest);
            return null;
        }

        @Override // d.AbstractC4282a
        @InterfaceC4335i
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @NotNull PickVisualMediaRequest input) {
            G.p(context, "context");
            G.p(input, "input");
            a aVar = f194521a;
            if (aVar.j()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.e(input.f85045a));
                return intent;
            }
            if (aVar.i(context)) {
                ResolveInfo resolveInfoD = aVar.d(context);
                if (resolveInfoD == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo = resolveInfoD.activityInfo;
                Intent intent2 = new Intent(f194522b);
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(aVar.e(input.f85045a));
                return intent2;
            }
            if (!aVar.f(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(aVar.e(input.f85045a));
                if (intent3.getType() == null) {
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent3;
            }
            ResolveInfo resolveInfoC = aVar.c(context);
            if (resolveInfoC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = resolveInfoC.activityInfo;
            Intent intent4 = new Intent(f194524d);
            intent4.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent4.setType(aVar.e(input.f85045a));
            return intent4;
        }

        @Nullable
        public final AbstractC4282a.C0707a<Uri> f(@NotNull Context context, @NotNull PickVisualMediaRequest input) {
            G.p(context, "context");
            G.p(input, "input");
            return null;
        }

        @Override // d.AbstractC4282a
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            return data == null ? (Uri) U.L2(d.f194518a.a(intent)) : data;
        }
    }

    /* JADX INFO: renamed from: d.b$k */
    @V({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12541#2,2:960\n8676#2,2:962\n9358#2,4:964\n11365#2:968\n11700#2,3:969\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n*L\n188#1:960,2\n195#1:962,2\n195#1:964,4\n208#1:968\n208#1:969,3\n*E\n"})
    public static final class k extends AbstractC4282a<String[], Map<String, Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f194530a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f194531b = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f194532c = "androidx.activity.result.contract.extra.PERMISSIONS";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f194533d = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* JADX INFO: renamed from: d.b$k$a */
        public static final class a {
            public a() {
            }

            @NotNull
            public final Intent a(@NotNull String[] input) {
                G.p(input, "input");
                Intent intentPutExtra = new Intent(k.f194531b).putExtra(k.f194532c, input);
                G.o(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            }

            public a(C4969v c4969v) {
            }
        }

        @Override // d.AbstractC4282a
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @NotNull String[] input) {
            G.p(context, "context");
            G.p(input, "input");
            return f194530a.a(input);
        }

        @Override // d.AbstractC4282a
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC4282a.C0707a<Map<String, Boolean>> b(@NotNull Context context, @NotNull String[] input) {
            G.p(context, "context");
            G.p(input, "input");
            if (input.length == 0) {
                return new AbstractC4282a.C0707a<>(n0.z());
            }
            for (String str : input) {
                if (C0920d.checkSelfPermission(context, str) != 0) {
                    return null;
                }
            }
            int iJ = m0.j(input.length);
            if (iJ < 16) {
                iJ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
            for (String str2 : input) {
                linkedHashMap.put(str2, Boolean.TRUE);
            }
            return new AbstractC4282a.C0707a<>(linkedHashMap);
        }

        @Override // d.AbstractC4282a
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<String, Boolean> c(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                return n0.z();
            }
            if (intent == null) {
                return n0.z();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(f194532c);
            int[] intArrayExtra = intent.getIntArrayExtra(f194533d);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return n0.z();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i11 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i11 == 0));
            }
            return n0.B0(U.o6(B.lb(stringArrayExtra), arrayList));
        }
    }

    /* JADX INFO: renamed from: d.b$l */
    @V({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12774#2,2:960\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n*L\n228#1:960,2\n*E\n"})
    public static final class l extends AbstractC4282a<String, Boolean> {
        @Override // d.AbstractC4282a
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @NotNull String input) {
            G.p(context, "context");
            G.p(input, "input");
            return k.f194530a.a(new String[]{input});
        }

        @Override // d.AbstractC4282a
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC4282a.C0707a<Boolean> b(@NotNull Context context, @NotNull String input) {
            G.p(context, "context");
            G.p(input, "input");
            if (C0920d.checkSelfPermission(context, input) == 0) {
                return new AbstractC4282a.C0707a<>(Boolean.TRUE);
            }
            return null;
        }

        @Override // d.AbstractC4282a
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean c(int i10, @Nullable Intent intent) {
            if (intent == null || i10 != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(k.f194533d);
            boolean z10 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    if (intArrayExtra[i11] == 0) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: renamed from: d.b$m */
    public static final class m extends AbstractC4282a<Intent, ActivityResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f194534a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f194535b = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* JADX INFO: renamed from: d.b$m$a */
        public static final class a {
            public a() {
            }

            public a(C4969v c4969v) {
            }
        }

        @Override // d.AbstractC4282a
        public /* bridge */ /* synthetic */ Intent a(Context context, Intent intent) {
            Intent intent2 = intent;
            d(context, intent2);
            return intent2;
        }

        @Override // d.AbstractC4282a
        public ActivityResult c(int i10, Intent intent) {
            return new ActivityResult(i10, intent);
        }

        @NotNull
        public Intent d(@NotNull Context context, @NotNull Intent input) {
            G.p(context, "context");
            G.p(input, "input");
            return input;
        }

        @NotNull
        public ActivityResult e(int i10, @Nullable Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    /* JADX INFO: renamed from: d.b$n */
    public static final class n extends AbstractC4282a<IntentSenderRequest, ActivityResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f194536a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f194537b = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f194538c = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f194539d = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* JADX INFO: renamed from: d.b$n$a */
        public static final class a {
            public a() {
            }

            public a(C4969v c4969v) {
            }
        }

        @Override // d.AbstractC4282a
        public ActivityResult c(int i10, Intent intent) {
            return new ActivityResult(i10, intent);
        }

        @Override // d.AbstractC4282a
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @NotNull IntentSenderRequest input) {
            G.p(context, "context");
            G.p(input, "input");
            Intent intentPutExtra = new Intent(f194537b).putExtra(f194538c, input);
            G.o(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return intentPutExtra;
        }

        @NotNull
        public ActivityResult e(int i10, @Nullable Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    /* JADX INFO: renamed from: d.b$o */
    public static class o extends AbstractC4282a<Uri, Boolean> {
        @Override // d.AbstractC4282a
        public /* bridge */ /* synthetic */ AbstractC4282a.C0707a<Boolean> b(Context context, Uri uri) {
            e(context, uri);
            return null;
        }

        @Override // d.AbstractC4282a
        @InterfaceC4335i
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @NotNull Uri input) {
            G.p(context, "context");
            G.p(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra(AgentOptions.OUTPUT, input);
            G.o(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Nullable
        public final AbstractC4282a.C0707a<Boolean> e(@NotNull Context context, @NotNull Uri input) {
            G.p(context, "context");
            G.p(input, "input");
            return null;
        }

        @Override // d.AbstractC4282a
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Boolean c(int i10, @Nullable Intent intent) {
            return Boolean.valueOf(i10 == -1);
        }
    }

    /* JADX INFO: renamed from: d.b$p */
    @V({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class p extends AbstractC4282a<Void, Bitmap> {
        @Override // d.AbstractC4282a
        public /* bridge */ /* synthetic */ AbstractC4282a.C0707a<Bitmap> b(Context context, Void r22) {
            e(context, r22);
            return null;
        }

        @Override // d.AbstractC4282a
        @InterfaceC4335i
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @Nullable Void r22) {
            G.p(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @Nullable
        public final AbstractC4282a.C0707a<Bitmap> e(@NotNull Context context, @Nullable Void r22) {
            G.p(context, "context");
            return null;
        }

        @Override // d.AbstractC4282a
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Bitmap c(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: d.b$q */
    @V({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakeVideo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    @InterfaceC4982o(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    public static class q extends AbstractC4282a<Uri, Bitmap> {
        @Override // d.AbstractC4282a
        public /* bridge */ /* synthetic */ AbstractC4282a.C0707a<Bitmap> b(Context context, Uri uri) {
            e(context, uri);
            return null;
        }

        @Override // d.AbstractC4282a
        @InterfaceC4335i
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @NotNull Uri input) {
            G.p(context, "context");
            G.p(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra(AgentOptions.OUTPUT, input);
            G.o(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Nullable
        public final AbstractC4282a.C0707a<Bitmap> e(@NotNull Context context, @NotNull Uri input) {
            G.p(context, "context");
            G.p(input, "input");
            return null;
        }

        @Override // d.AbstractC4282a
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Bitmap c(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: d.b$b, reason: collision with other inner class name */
    @T(19)
    @V({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$CreateDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class C0708b extends AbstractC4282a<String, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f194517a;

        public C0708b(@NotNull String mimeType) {
            G.p(mimeType, "mimeType");
            this.f194517a = mimeType;
        }

        @Override // d.AbstractC4282a
        public /* bridge */ /* synthetic */ AbstractC4282a.C0707a<Uri> b(Context context, String str) {
            e(context, str);
            return null;
        }

        @Override // d.AbstractC4282a
        @InterfaceC4335i
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@NotNull Context context, @NotNull String input) {
            G.p(context, "context");
            G.p(input, "input");
            Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f194517a).putExtra("android.intent.extra.TITLE", input);
            G.o(intentPutExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return intentPutExtra;
        }

        @Nullable
        public final AbstractC4282a.C0707a<Uri> e(@NotNull Context context, @NotNull String input) {
            G.p(context, "context");
            G.p(input, "input");
            return null;
        }

        @Override // d.AbstractC4282a
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @Nullable Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @InterfaceC4982o(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @InterfaceC4852c0(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public C0708b() {
            this("*/*");
        }
    }
}
