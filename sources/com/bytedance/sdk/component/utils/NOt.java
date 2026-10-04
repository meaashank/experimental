package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    private static ZRu ZRu;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.NOt$NOt, reason: collision with other inner class name */
    public interface InterfaceC0424NOt {
        void ZRu();

        void ZRu(Throwable th);
    }

    public interface ZRu {
        ExecutorService getAsyncStartActivityThreadPool();

        boolean isEnableAsyncStartActivity();
    }

    public static void ZRu(ZRu zRu) {
        ZRu = zRu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean mZ(Context context, Intent intent, InterfaceC0424NOt interfaceC0424NOt) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0424NOt == null) {
                    return true;
                }
                interfaceC0424NOt.ZRu();
                return true;
            } catch (Throwable th) {
                if (interfaceC0424NOt != null) {
                    interfaceC0424NOt.ZRu(th);
                }
            }
        }
        return false;
    }

    public static boolean ZRu(Context context, Intent intent, InterfaceC0424NOt interfaceC0424NOt) {
        return ZRu(context, intent, interfaceC0424NOt, false);
    }

    public static boolean ZRu(final Context context, final Intent intent, final InterfaceC0424NOt interfaceC0424NOt, boolean z10) {
        ZRu zRu;
        ExecutorService asyncStartActivityThreadPool;
        if (z10 && (zRu = ZRu) != null && zRu.isEnableAsyncStartActivity() && (asyncStartActivityThreadPool = ZRu.getAsyncStartActivityThreadPool()) != null) {
            asyncStartActivityThreadPool.execute(new com.bytedance.sdk.component.FA.FA("startAct") { // from class: com.bytedance.sdk.component.utils.NOt.1
                @Override // java.lang.Runnable
                public void run() {
                    NOt.mZ(context, intent, interfaceC0424NOt);
                }
            });
            return true;
        }
        return mZ(context, intent, interfaceC0424NOt);
    }

    public static Activity ZRu(View view) {
        View viewFindViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.content)) == null || (context = viewFindViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }
}
