package com.bytedance.sdk.component.adexpress.uR;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.sdk.component.utils.lp;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.renderscript.Allocation] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.renderscript.Allocation] */
    public static Bitmap ZRu(Context context, Bitmap bitmap, int i10) {
        RenderScript renderScriptCreate;
        Allocation allocationCreateFromBitmap;
        ?? Create;
        ?? CreateFromBitmap;
        com.bytedance.sdk.component.adexpress.ZRu.ZRu.mZ mZVarMZ;
        StringBuilder sb2;
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (!com.bytedance.sdk.component.adexpress.uR.NOt() || i11 >= 26) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                renderScriptCreate = RenderScript.create(context);
                if (renderScriptCreate == null) {
                    try {
                        com.bytedance.sdk.component.adexpress.ZRu.ZRu.mZ mZVarMZ2 = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ();
                        if (mZVarMZ2 == null || !mZVarMZ2.WMI() || renderScriptCreate == null) {
                            return null;
                        }
                        RenderScript.releaseAllContexts();
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        sb2 = new StringBuilder("blur destroy");
                    }
                } else {
                    try {
                        Create = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                        try {
                            allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                            try {
                                CreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                                try {
                                    Create.setRadius(i10);
                                    Create.setInput(allocationCreateFromBitmap);
                                    Create.forEach(CreateFromBitmap);
                                    CreateFromBitmap.copyTo(bitmapCreateBitmap);
                                    try {
                                        com.bytedance.sdk.component.adexpress.ZRu.ZRu.mZ mZVarMZ3 = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ();
                                        if (mZVarMZ3 != null && mZVarMZ3.WMI()) {
                                            RenderScript.releaseAllContexts();
                                            if (allocationCreateFromBitmap != null) {
                                                allocationCreateFromBitmap.destroy();
                                            }
                                            CreateFromBitmap.destroy();
                                            Create.destroy();
                                        }
                                    } catch (Throwable th2) {
                                        lp.ZRu("BlurUtils", "blur destroy" + th2.getMessage());
                                    }
                                    return bitmapCreateBitmap;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        lp.ZRu("BlurUtils", "blue has occur exception" + th.getMessage());
                                        try {
                                            mZVarMZ = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ();
                                            if (mZVarMZ == null && mZVarMZ.WMI()) {
                                                if (renderScriptCreate != null) {
                                                    RenderScript.releaseAllContexts();
                                                }
                                                if (allocationCreateFromBitmap != null) {
                                                    allocationCreateFromBitmap.destroy();
                                                }
                                                if (CreateFromBitmap != 0) {
                                                    CreateFromBitmap.destroy();
                                                }
                                                if (Create == 0) {
                                                    return null;
                                                }
                                                Create.destroy();
                                                return null;
                                            }
                                        } catch (Throwable th4) {
                                            lp.ZRu("BlurUtils", "blur destroy" + th4.getMessage());
                                            return null;
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            com.bytedance.sdk.component.adexpress.ZRu.ZRu.mZ mZVarMZ4 = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ();
                                            if (mZVarMZ4 != null && mZVarMZ4.WMI()) {
                                                if (renderScriptCreate != null) {
                                                    RenderScript.releaseAllContexts();
                                                }
                                                if (allocationCreateFromBitmap != null) {
                                                    allocationCreateFromBitmap.destroy();
                                                }
                                                if (CreateFromBitmap != 0) {
                                                    CreateFromBitmap.destroy();
                                                }
                                                if (Create != 0) {
                                                    Create.destroy();
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            lp.ZRu("BlurUtils", "blur destroy" + th6.getMessage());
                                        }
                                        throw th5;
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                CreateFromBitmap = 0;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            allocationCreateFromBitmap = null;
                            CreateFromBitmap = 0;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        allocationCreateFromBitmap = null;
                        Create = allocationCreateFromBitmap;
                        CreateFromBitmap = Create;
                        lp.ZRu("BlurUtils", "blue has occur exception" + th.getMessage());
                        mZVarMZ = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ();
                        return mZVarMZ == null ? null : null;
                    }
                }
            } else {
                try {
                    com.bytedance.sdk.component.adexpress.ZRu.ZRu.mZ mZVarMZ5 = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ();
                    if (mZVarMZ5 != null) {
                        mZVarMZ5.WMI();
                    }
                    return null;
                } catch (Throwable th10) {
                    th = th10;
                    sb2 = new StringBuilder("blur destroy");
                }
            }
            sb2.append(th.getMessage());
            lp.ZRu("BlurUtils", sb2.toString());
            return null;
        } catch (Throwable th11) {
            th = th11;
            renderScriptCreate = null;
            allocationCreateFromBitmap = null;
        }
    }
}
