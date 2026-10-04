package com.squareup.picasso;

import U6.b;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import okio.Q;

/* JADX INFO: loaded from: classes7.dex */
class AssetRequestHandler extends RequestHandler {
    protected static final String ANDROID_ASSET = "android_asset";
    private static final int ASSET_PREFIX_LENGTH = 22;
    private AssetManager assetManager;
    private final Context context;
    private final Object lock = new Object();

    public AssetRequestHandler(Context context) {
        this.context = context;
    }

    public static String getFilePath(Request request) {
        return request.uri.toString().substring(ASSET_PREFIX_LENGTH);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        return b.h.f68653a.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        if (this.assetManager == null) {
            synchronized (this.lock) {
                try {
                    if (this.assetManager == null) {
                        this.assetManager = this.context.getAssets();
                    }
                } finally {
                }
            }
        }
        return new RequestHandler.Result(Q.s(this.assetManager.open(getFilePath(request))), Picasso.LoadedFrom.DISK);
    }
}
