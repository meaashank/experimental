package com.prism.gaia.server;

import android.annotation.TargetApi;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.gaia.server.C4141a;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes6.dex */
public class GaiaGuestContentProviderProxy extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f166096a = "asdf-".concat("GaiaGuestContentProviderProxy");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f166097b = ".provider.proxy";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f166098c = "com.app.hider.master.promax.provider.proxy";

    public static String v() {
        return f166098c;
    }

    public static Uri w(Uri uri) {
        if (!f166098c.equals(uri.getAuthority())) {
            return uri;
        }
        String strDecode = Uri.decode(uri.getPath());
        if (strDecode.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            strDecode = strDecode.substring(1);
        }
        return Uri.parse(strDecode);
    }

    public static Uri x(Uri uri) {
        return f166098c.equals(uri.getAuthority()) ? uri : new Uri.Builder().scheme("content").authority(f166098c).path(Uri.encode(uri.toString())).build();
    }

    public final /* synthetic */ Integer A(Uri uri, String str, String[] strArr) {
        return Integer.valueOf(getContext().getContentResolver().delete(uri, str, strArr));
    }

    public final /* synthetic */ Integer B(Uri uri, Bundle bundle) {
        return Integer.valueOf(getContext().getContentResolver().delete(uri, bundle));
    }

    public final /* synthetic */ String[] C(Uri uri, String str) {
        return getContext().getContentResolver().getStreamTypes(uri, str);
    }

    public final /* synthetic */ String D(Uri uri) {
        return getContext().getContentResolver().getType(uri);
    }

    public final /* synthetic */ Uri E(Uri uri, ContentValues contentValues) {
        return getContext().getContentResolver().insert(uri, contentValues);
    }

    public final /* synthetic */ Uri F(Uri uri, ContentValues contentValues, Bundle bundle) {
        return getContext().getContentResolver().insert(uri, contentValues, bundle);
    }

    public final /* synthetic */ AssetFileDescriptor G(Uri uri, String str) throws FileNotFoundException {
        return getContext().getContentResolver().openAssetFileDescriptor(uri, str);
    }

    public final /* synthetic */ AssetFileDescriptor H(Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
        return getContext().getContentResolver().openAssetFileDescriptor(uri, str, cancellationSignal);
    }

    public final /* synthetic */ ParcelFileDescriptor I(Uri uri, String str) throws FileNotFoundException {
        return getContext().getContentResolver().openFileDescriptor(uri, str);
    }

    public final /* synthetic */ ParcelFileDescriptor J(Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
        return getContext().getContentResolver().openFileDescriptor(uri, str, cancellationSignal);
    }

    public final /* synthetic */ AssetFileDescriptor K(Uri uri, String str, Bundle bundle) throws FileNotFoundException {
        return getContext().getContentResolver().openTypedAssetFileDescriptor(uri, str, bundle);
    }

    public final /* synthetic */ AssetFileDescriptor L(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) throws FileNotFoundException {
        return getContext().getContentResolver().openTypedAssetFileDescriptor(uri, str, bundle, cancellationSignal);
    }

    public final /* synthetic */ Cursor M(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return getContext().getContentResolver().query(uri, strArr, str, strArr2, str2);
    }

    public final /* synthetic */ Cursor N(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return getContext().getContentResolver().query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }

    public final /* synthetic */ Cursor O(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        return getContext().getContentResolver().query(uri, strArr, bundle, cancellationSignal);
    }

    public final /* synthetic */ Boolean P(Uri uri, Bundle bundle, CancellationSignal cancellationSignal) {
        return Boolean.valueOf(getContext().getContentResolver().refresh(uri, bundle, cancellationSignal));
    }

    public final /* synthetic */ Uri Q(Uri uri) {
        return getContext().getContentResolver().uncanonicalize(uri);
    }

    public final /* synthetic */ Integer R(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return Integer.valueOf(getContext().getContentResolver().update(uri, contentValues, str, strArr));
    }

    public final /* synthetic */ Integer S(Uri uri, ContentValues contentValues, Bundle bundle) {
        return Integer.valueOf(getContext().getContentResolver().update(uri, contentValues, bundle));
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(@NonNull Uri uri, @NonNull final ContentValues[] contentValuesArr) {
        final Uri uriW = w(uri);
        return ((Integer) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.C
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f166035a.y(uriW, contentValuesArr);
            }
        })).intValue();
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        return super.call(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    @Nullable
    @TargetApi(19)
    public Uri canonicalize(@NonNull Uri uri) {
        final Uri uriW = w(uri);
        return (Uri) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.v
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f167702a.z(uriW);
            }
        });
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, final String str, final String[] strArr) {
        final Uri uriW = w(uri);
        return ((Integer) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.G
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f166053a.A(uriW, str, strArr);
            }
        })).intValue();
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String[] getStreamTypes(@NonNull Uri uri, @NonNull final String str) {
        final Uri uriW = w(uri);
        return (String[]) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.y
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f167713a.C(uriW, str);
            }
        });
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        final Uri uriW = w(uri);
        return (String) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.q
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f167686a.D(uriW);
            }
        });
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, final ContentValues contentValues) {
        final Uri uriW = w(uri);
        return (Uri) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.A
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f166025a.E(uriW, contentValues);
            }
        });
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public AssetFileDescriptor openAssetFile(@NonNull Uri uri, @NonNull final String str) throws FileNotFoundException {
        final Uri uriW = w(uri);
        return (AssetFileDescriptor) C4141a.d(new C4141a.InterfaceC0674a() { // from class: com.prism.gaia.server.z
            @Override // com.prism.gaia.server.C4141a.InterfaceC0674a
            public final Object run() {
                return this.f167716a.G(uriW, str);
            }
        });
    }

    @Override // android.content.ContentProvider
    @Nullable
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull final String str) throws FileNotFoundException {
        final Uri uriW = w(uri);
        return (ParcelFileDescriptor) C4141a.d(new C4141a.InterfaceC0674a() { // from class: com.prism.gaia.server.t
            @Override // com.prism.gaia.server.C4141a.InterfaceC0674a
            public final Object run() {
                return this.f167695a.I(uriW, str);
            }
        });
    }

    @Override // android.content.ContentProvider
    @NonNull
    public <T> ParcelFileDescriptor openPipeHelper(@NonNull Uri uri, @NonNull String str, @Nullable Bundle bundle, @Nullable T t10, @NonNull ContentProvider.PipeDataWriter<T> pipeDataWriter) throws FileNotFoundException {
        return super.openPipeHelper(w(uri), str, bundle, t10, pipeDataWriter);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public AssetFileDescriptor openTypedAssetFile(@NonNull Uri uri, @NonNull final String str, @Nullable final Bundle bundle) throws FileNotFoundException {
        final Uri uriW = w(uri);
        return (AssetFileDescriptor) C4141a.d(new C4141a.InterfaceC0674a() { // from class: com.prism.gaia.server.x
            @Override // com.prism.gaia.server.C4141a.InterfaceC0674a
            public final Object run() {
                return this.f167709a.K(uriW, str, bundle);
            }
        });
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, final String[] strArr, final String str, final String[] strArr2, final String str2) {
        final Uri uriW = w(uri);
        return (Cursor) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.E
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f166043a.M(uriW, strArr, str, strArr2, str2);
            }
        });
    }

    @Override // android.content.ContentProvider
    @TargetApi(26)
    public boolean refresh(Uri uri, @Nullable final Bundle bundle, @Nullable final CancellationSignal cancellationSignal) {
        final Uri uriW = w(uri);
        return ((Boolean) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.m
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f167399a.P(uriW, bundle, cancellationSignal);
            }
        })).booleanValue();
    }

    @Override // android.content.ContentProvider
    @Nullable
    @TargetApi(19)
    public Uri uncanonicalize(@NonNull Uri uri) {
        final Uri uriW = w(uri);
        return (Uri) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.s
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f167693a.Q(uriW);
            }
        });
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, final ContentValues contentValues, final String str, final String[] strArr) {
        final Uri uriW = w(uri);
        return ((Integer) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.r
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f167688a.R(uriW, contentValues, str, strArr);
            }
        })).intValue();
    }

    public final /* synthetic */ Integer y(Uri uri, ContentValues[] contentValuesArr) {
        return Integer.valueOf(getContext().getContentResolver().bulkInsert(uri, contentValuesArr));
    }

    public final /* synthetic */ Uri z(Uri uri) {
        return getContext().getContentResolver().canonicalize(uri);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable Bundle bundle) {
        return super.call(str, str2, str3, bundle);
    }

    @Override // android.content.ContentProvider
    @e.T(api = 30)
    public int delete(@NonNull Uri uri, @Nullable final Bundle bundle) {
        final Uri uriW = w(uri);
        return ((Integer) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.n
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f167403a.B(uriW, bundle);
            }
        })).intValue();
    }

    @Override // android.content.ContentProvider
    @Nullable
    @e.T(api = 30)
    public Uri insert(@NonNull Uri uri, @Nullable final ContentValues contentValues, @Nullable final Bundle bundle) {
        final Uri uriW = w(uri);
        return (Uri) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.u
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f167698a.F(uriW, contentValues, bundle);
            }
        });
    }

    @Override // android.content.ContentProvider
    @Nullable
    @TargetApi(19)
    public AssetFileDescriptor openAssetFile(@NonNull Uri uri, @NonNull final String str, @Nullable final CancellationSignal cancellationSignal) throws FileNotFoundException {
        final Uri uriW = w(uri);
        return (AssetFileDescriptor) C4141a.d(new C4141a.InterfaceC0674a() { // from class: com.prism.gaia.server.p
            @Override // com.prism.gaia.server.C4141a.InterfaceC0674a
            public final Object run() {
                return this.f167410a.H(uriW, str, cancellationSignal);
            }
        });
    }

    @Override // android.content.ContentProvider
    @Nullable
    @TargetApi(19)
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull final String str, @Nullable final CancellationSignal cancellationSignal) throws FileNotFoundException {
        final Uri uriW = w(uri);
        return (ParcelFileDescriptor) C4141a.d(new C4141a.InterfaceC0674a() { // from class: com.prism.gaia.server.F
            @Override // com.prism.gaia.server.C4141a.InterfaceC0674a
            public final Object run() {
                return this.f166049a.J(uriW, str, cancellationSignal);
            }
        });
    }

    @Override // android.content.ContentProvider
    @Nullable
    @TargetApi(19)
    public AssetFileDescriptor openTypedAssetFile(@NonNull Uri uri, @NonNull final String str, @Nullable final Bundle bundle, @Nullable final CancellationSignal cancellationSignal) throws FileNotFoundException {
        final Uri uriW = w(uri);
        return (AssetFileDescriptor) C4141a.d(new C4141a.InterfaceC0674a() { // from class: com.prism.gaia.server.D
            @Override // com.prism.gaia.server.C4141a.InterfaceC0674a
            public final Object run() {
                return this.f166038a.L(uriW, str, bundle, cancellationSignal);
            }
        });
    }

    @Override // android.content.ContentProvider
    @Nullable
    @TargetApi(16)
    public Cursor query(@NonNull Uri uri, @Nullable final String[] strArr, @Nullable final String str, @Nullable final String[] strArr2, @Nullable final String str2, @Nullable final CancellationSignal cancellationSignal) {
        final Uri uriW = w(uri);
        return (Cursor) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.B
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f166028a.N(uriW, strArr, str, strArr2, str2, cancellationSignal);
            }
        });
    }

    @Override // android.content.ContentProvider
    @e.T(api = 30)
    public int update(@NonNull Uri uri, @Nullable final ContentValues contentValues, @Nullable final Bundle bundle) {
        final Uri uriW = w(uri);
        return ((Integer) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.o
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f167406a.S(uriW, contentValues, bundle);
            }
        })).intValue();
    }

    @Override // android.content.ContentProvider
    @Nullable
    @TargetApi(26)
    public Cursor query(@NonNull Uri uri, @Nullable final String[] strArr, @Nullable final Bundle bundle, @Nullable final CancellationSignal cancellationSignal) {
        final Uri uriW = w(uri);
        return (Cursor) C4141a.e(new C4141a.b() { // from class: com.prism.gaia.server.w
            @Override // com.prism.gaia.server.C4141a.b
            public final Object run() {
                return this.f167704a.O(uriW, strArr, bundle, cancellationSignal);
            }
        });
    }
}
