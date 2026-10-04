package com.prism.hider.utils;

import android.content.ComponentName;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.util.ItemInfoMatcher;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    public class a extends ItemInfoMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f168391a;

        public a(Map map) {
            this.f168391a = map;
        }

        @Override // com.android.launcher3.util.ItemInfoMatcher
        public boolean matches(ItemInfo itemInfo, ComponentName componentName) {
            return this.f168391a.containsKey(itemInfo.getPackageNameInComponent());
        }
    }

    public static ItemInfoMatcher a(Map map) {
        return new a(map);
    }
}
