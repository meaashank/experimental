package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import e.T;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@T(api = 30)
final class ResourcesLoaderUtils {
    private ResourcesLoaderUtils() {
    }

    public static boolean addResourcesLoaderToContext(Context context, Map<Integer, Integer> map) {
        ResourcesLoader resourcesLoaderCreate = ColorResourcesLoaderCreator.create(context, map);
        if (resourcesLoaderCreate == null) {
            return false;
        }
        context.getResources().addLoaders(resourcesLoaderCreate);
        return true;
    }

    public static boolean isColorResource(int i10) {
        return 28 <= i10 && i10 <= 31;
    }
}
