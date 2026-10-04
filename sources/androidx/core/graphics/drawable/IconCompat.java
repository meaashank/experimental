package androidx.core.graphics.drawable;

import B0.C0920d;
import D0.i;
import U6.b;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.compose.foundation.text.input.internal.T0;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.lib_google_billing.q;
import e.C;
import e.InterfaceC4337k;
import e.InterfaceC4346u;
import e.T;
import e.f0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @f0
    public static final String f111190A = "obj";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @f0
    public static final String f111191B = "int1";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @f0
    public static final String f111192C = "int2";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @f0
    public static final String f111193D = "tint_list";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @f0
    public static final String f111194E = "tint_mode";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @f0
    public static final String f111195F = "string1";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final PorterDuff.Mode f111196G = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f111197k = "IconCompat";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f111198l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f111199m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f111200n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f111201o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f111202p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f111203q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f111204r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f111205s = 0.25f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f111206t = 0.6666667f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f111207u = 0.9166667f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final float f111208v = 0.010416667f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f111209w = 0.020833334f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f111210x = 61;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f111211y = 30;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @f0
    public static final String f111212z = "type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f111213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f111214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public byte[] f111215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable f111216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f111217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f111218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ColorStateList f111219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f111220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String f111221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String f111222j;

    @T(23)
    public static class a {
        @Nullable
        public static IconCompat a(@NonNull Context context, @NonNull Icon icon) {
            int iE = e(icon);
            if (iE == 2) {
                String strD = d(icon);
                try {
                    return IconCompat.w(IconCompat.A(context, strD), strD, c(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            }
            if (iE == 4) {
                return IconCompat.s(f(icon));
            }
            if (iE == 6) {
                return IconCompat.p(f(icon));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f111214b = icon;
            return iconCompat;
        }

        public static IconCompat b(@NonNull Object obj) {
            obj.getClass();
            int iE = e(obj);
            if (iE == 2) {
                return IconCompat.w(null, d(obj), c(obj));
            }
            if (iE == 4) {
                return IconCompat.s(f(obj));
            }
            if (iE == 6) {
                return IconCompat.p(f(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f111214b = obj;
            return iconCompat;
        }

        @InterfaceC4346u
        @C
        public static int c(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.f111197k, "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.f111197k, "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.f111197k, "Unable to get icon resource", e12);
                return 0;
            }
        }

        @Nullable
        public static String d(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.f111197k, "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.f111197k, "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.f111197k, "Unable to get icon package", e12);
                return null;
            }
        }

        public static int e(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.f111197k, "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.f111197k, "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.f111197k, "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        @Nullable
        public static Uri f(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e(IconCompat.f111197k, "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e(IconCompat.f111197k, "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e(IconCompat.f111197k, "Unable to get icon uri", e12);
                return null;
            }
        }

        public static Drawable g(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        public static Icon h(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f111213a) {
                case -1:
                    return (Icon) iconCompat.f111214b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f111214b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.z(), iconCompat.f111217e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f111214b, iconCompat.f111217e, iconCompat.f111218f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f111214b);
                    break;
                case 5:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.n((Bitmap) iconCompat.f111214b, false)) : b.b((Bitmap) iconCompat.f111214b);
                    break;
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.C());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.C());
                        }
                        InputStream inputStreamD = iconCompat.D(context);
                        if (inputStreamD == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.C());
                        }
                        if (i10 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.n(BitmapFactory.decodeStream(inputStreamD), false));
                        } else {
                            iconCreateWithBitmap = b.b(BitmapFactory.decodeStream(inputStreamD));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f111219g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f111220h;
            if (mode != IconCompat.f111196G) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    @T(26)
    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @T(28)
    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @T(30)
    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface e {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
        this.f111213a = -1;
        this.f111215c = null;
        this.f111216d = null;
        this.f111217e = 0;
        this.f111218f = 0;
        this.f111219g = null;
        this.f111220h = f111196G;
        this.f111221i = null;
    }

    public static Resources A(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f111197k, String.format("Unable to find pkg=%s for icon", str), e10);
            return null;
        }
    }

    public static String L(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return q.f194113a;
        }
    }

    @Nullable
    public static IconCompat j(@NonNull Bundle bundle) {
        int i10 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i10);
        iconCompat.f111217e = bundle.getInt(f111191B);
        iconCompat.f111218f = bundle.getInt(f111192C);
        iconCompat.f111222j = bundle.getString(f111195F);
        if (bundle.containsKey(f111193D)) {
            iconCompat.f111219g = (ColorStateList) bundle.getParcelable(f111193D);
        }
        if (bundle.containsKey(f111194E)) {
            iconCompat.f111220h = PorterDuff.Mode.valueOf(bundle.getString(f111194E));
        }
        switch (i10) {
            case -1:
            case 1:
            case 5:
                iconCompat.f111214b = bundle.getParcelable(f111190A);
                return iconCompat;
            case 0:
            default:
                T0.a("Unknown type ", i10, f111197k);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f111214b = bundle.getString(f111190A);
                return iconCompat;
            case 3:
                iconCompat.f111214b = bundle.getByteArray(f111190A);
                return iconCompat;
        }
    }

    @Nullable
    @T(23)
    public static IconCompat k(@NonNull Context context, @NonNull Icon icon) {
        icon.getClass();
        return a.a(context, icon);
    }

    @Nullable
    @T(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat l(@NonNull Icon icon) {
        return a.b(icon);
    }

    @Nullable
    @T(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat m(@NonNull Icon icon) {
        if (a.e(icon) == 2 && a.c(icon) == 0) {
            return null;
        }
        return a.b(icon);
    }

    @f0
    public static Bitmap n(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, androidx.swiperefreshlayout.widget.a.f117548e);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, androidx.swiperefreshlayout.widget.a.f117549f);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @NonNull
    public static IconCompat o(@NonNull Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f111214b = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat p(@NonNull Uri uri) {
        uri.getClass();
        return q(uri.toString());
    }

    @NonNull
    public static IconCompat q(@NonNull String str) {
        str.getClass();
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f111214b = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat r(@NonNull Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f111214b = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat s(@NonNull Uri uri) {
        uri.getClass();
        return t(uri.toString());
    }

    @NonNull
    public static IconCompat t(@NonNull String str) {
        str.getClass();
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f111214b = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat u(@NonNull byte[] bArr, int i10, int i11) {
        bArr.getClass();
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f111214b = bArr;
        iconCompat.f111217e = i10;
        iconCompat.f111218f = i11;
        return iconCompat;
    }

    @NonNull
    public static IconCompat v(@NonNull Context context, @InterfaceC4346u int i10) {
        context.getClass();
        return w(context.getResources(), context.getPackageName(), i10);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat w(@Nullable Resources resources, @NonNull String str, @InterfaceC4346u int i10) {
        str.getClass();
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f111217e = i10;
        if (resources != null) {
            try {
                iconCompat.f111214b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f111214b = str;
        }
        iconCompat.f111222j = str;
        return iconCompat;
    }

    public int B() {
        int i10 = this.f111213a;
        return i10 == -1 ? a.e(this.f111214b) : i10;
    }

    @NonNull
    public Uri C() {
        int i10 = this.f111213a;
        if (i10 == -1) {
            return a.f(this.f111214b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f111214b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public InputStream D(@NonNull Context context) {
        Uri uriC = C();
        String scheme = uriC.getScheme();
        if ("content".equals(scheme) || b.h.f68653a.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriC);
            } catch (Exception e10) {
                Log.w(f111197k, "Unable to load image from URI: " + uriC, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f111214b));
        } catch (FileNotFoundException e11) {
            Log.w(f111197k, "Unable to load image from path: " + uriC, e11);
            return null;
        }
    }

    @Nullable
    public Drawable E(@NonNull Context context) {
        i(context);
        return K(context).loadDrawable(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Drawable F(Context context) {
        switch (this.f111213a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f111214b);
            case 2:
                String strZ = z();
                if (TextUtils.isEmpty(strZ)) {
                    strZ = context.getPackageName();
                }
                try {
                    return i.g(A(context, strZ), this.f111217e, context.getTheme());
                } catch (RuntimeException e10) {
                    Log.e(f111197k, String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f111217e), this.f111214b), e10);
                }
                break;
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f111214b, this.f111217e, this.f111218f));
            case 4:
                InputStream inputStreamD = D(context);
                if (inputStreamD != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamD));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), n((Bitmap) this.f111214b, false));
            case 6:
                InputStream inputStreamD2 = D(context);
                if (inputStreamD2 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? b.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamD2))) : new BitmapDrawable(context.getResources(), n(BitmapFactory.decodeStream(inputStreamD2), false));
                }
                return null;
            default:
                return null;
        }
    }

    @NonNull
    public IconCompat G(@InterfaceC4337k int i10) {
        return H(ColorStateList.valueOf(i10));
    }

    @NonNull
    public IconCompat H(@Nullable ColorStateList colorStateList) {
        this.f111219g = colorStateList;
        return this;
    }

    @NonNull
    public IconCompat I(@Nullable PorterDuff.Mode mode) {
        this.f111220h = mode;
        return this;
    }

    @NonNull
    @T(23)
    @Deprecated
    public Icon J() {
        return K(null);
    }

    @NonNull
    @T(23)
    public Icon K(@Nullable Context context) {
        return a.h(this, context);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void f() {
        this.f111220h = PorterDuff.Mode.valueOf(this.f111221i);
        switch (this.f111213a) {
            case -1:
                Parcelable parcelable = this.f111216d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f111214b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f111216d;
                if (parcelable2 != null) {
                    this.f111214b = parcelable2;
                    return;
                }
                byte[] bArr = this.f111215c;
                this.f111214b = bArr;
                this.f111213a = 3;
                this.f111217e = 0;
                this.f111218f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f111215c, Charset.forName("UTF-16"));
                this.f111214b = str;
                if (this.f111213a == 2 && this.f111222j == null) {
                    this.f111222j = str.split(com.prism.gaia.server.accounts.b.f166434b0, -1)[0];
                    return;
                }
                return;
            case 3:
                this.f111214b = this.f111215c;
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void g(boolean z10) {
        this.f111221i = this.f111220h.name();
        switch (this.f111213a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f111216d = (Parcelable) this.f111214b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f111216d = (Parcelable) this.f111214b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f111214b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f111215c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f111215c = ((String) this.f111214b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f111215c = (byte[]) this.f111214b;
                return;
            case 4:
            case 6:
                this.f111215c = this.f111214b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void h(@NonNull Intent intent, @Nullable Drawable drawable, @NonNull Context context) {
        Bitmap bitmapCopy;
        i(context);
        int i10 = this.f111213a;
        if (i10 == 1) {
            bitmapCopy = (Bitmap) this.f111214b;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i10 == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(z(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.f111217e));
                    return;
                }
                Drawable drawable2 = C0920d.getDrawable(contextCreatePackageContext, this.f111217e);
                if (drawable2.getIntrinsicWidth() <= 0 || drawable2.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawable2.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawable2.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IllegalArgumentException("Can't find package " + this.f111214b, e10);
            }
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmapCopy = n((Bitmap) this.f111214b, true);
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void i(@NonNull Context context) {
        Object obj;
        if (this.f111213a != 2 || (obj = this.f111214b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(com.prism.gaia.server.accounts.b.f166434b0)) {
            String str2 = str.split(com.prism.gaia.server.accounts.b.f166434b0, -1)[1];
            String str3 = str2.split(RemoteSettings.FORWARD_SLASH_STRING, -1)[0];
            String str4 = str2.split(RemoteSettings.FORWARD_SLASH_STRING, -1)[1];
            String str5 = str.split(com.prism.gaia.server.accounts.b.f166434b0, -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i(f111197k, "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String strZ = z();
            int identifier = A(context, strZ).getIdentifier(str4, str3, str5);
            if (this.f111217e != identifier) {
                Log.i(f111197k, "Id has changed for " + strZ + C4.q.f17581a + str);
                this.f111217e = identifier;
            }
        }
    }

    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        switch (this.f111213a) {
            case -1:
                bundle.putParcelable(f111190A, (Parcelable) this.f111214b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable(f111190A, (Bitmap) this.f111214b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(f111190A, (String) this.f111214b);
                break;
            case 3:
                bundle.putByteArray(f111190A, (byte[]) this.f111214b);
                break;
        }
        bundle.putInt("type", this.f111213a);
        bundle.putInt(f111191B, this.f111217e);
        bundle.putInt(f111192C, this.f111218f);
        bundle.putString(f111195F, this.f111222j);
        ColorStateList colorStateList = this.f111219g;
        if (colorStateList != null) {
            bundle.putParcelable(f111193D, colorStateList);
        }
        PorterDuff.Mode mode = this.f111220h;
        if (mode != f111196G) {
            bundle.putString(f111194E, mode.name());
        }
        return bundle;
    }

    @NonNull
    public String toString() {
        if (this.f111213a == -1) {
            return String.valueOf(this.f111214b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(L(this.f111213a));
        switch (this.f111213a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f111214b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f111214b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f111222j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(y())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f111217e);
                if (this.f111218f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f111218f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f111214b);
                break;
        }
        if (this.f111219g != null) {
            sb2.append(" tint=");
            sb2.append(this.f111219g);
        }
        if (this.f111220h != f111196G) {
            sb2.append(" mode=");
            sb2.append(this.f111220h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Bitmap x() {
        int i10 = this.f111213a;
        if (i10 == -1) {
            Object obj = this.f111214b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f111214b;
        }
        if (i10 == 5) {
            return n((Bitmap) this.f111214b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    @InterfaceC4346u
    public int y() {
        int i10 = this.f111213a;
        if (i10 == -1) {
            return a.c(this.f111214b);
        }
        if (i10 == 2) {
            return this.f111217e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @NonNull
    public String z() {
        int i10 = this.f111213a;
        if (i10 == -1) {
            return a.d(this.f111214b);
        }
        if (i10 == 2) {
            String str = this.f111222j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f111214b).split(com.prism.gaia.server.accounts.b.f166434b0, -1)[0] : this.f111222j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public IconCompat(int i10) {
        this.f111215c = null;
        this.f111216d = null;
        this.f111217e = 0;
        this.f111218f = 0;
        this.f111219g = null;
        this.f111220h = f111196G;
        this.f111221i = null;
        this.f111213a = i10;
    }
}
