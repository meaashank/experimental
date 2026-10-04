package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import java.util.Arrays;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SharedInstances {

    @NotNull
    public static final SharedInstances INSTANCE = new SharedInstances();

    @NotNull
    private static final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker = new IInvocationCallbackInvoker() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewAppInvocationCallbackInvoker$1
        @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
        public final void invokeCallback(@NotNull Invocation it) {
            G.p(it, "it");
            WebViewApp.getCurrentApp().invokeCallback(it);
        }
    };

    @NotNull
    private static final INativeCallbackSubject webViewAppNativeCallbackSubject = new INativeCallbackSubject() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewAppNativeCallbackSubject$1
        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        public final void remove(@NotNull NativeCallback it) {
            G.p(it, "it");
            WebViewApp.getCurrentApp().removeCallback(it);
        }
    };

    @NotNull
    private static final IEventSender webViewEventSender = new IEventSender() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewEventSender$1
        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public final boolean sendEvent(@NotNull Enum<?> eventCategory, @NotNull Enum<?> eventId, @NotNull Object[] params) {
            G.p(eventCategory, "eventCategory");
            G.p(eventId, "eventId");
            G.p(params, "params");
            return WebViewApp.getCurrentApp().sendEvent(eventCategory, eventId, Arrays.copyOf(params, params.length));
        }
    };

    private SharedInstances() {
    }

    @NotNull
    public final IInvocationCallbackInvoker getWebViewAppInvocationCallbackInvoker() {
        return webViewAppInvocationCallbackInvoker;
    }

    @NotNull
    public final INativeCallbackSubject getWebViewAppNativeCallbackSubject() {
        return webViewAppNativeCallbackSubject;
    }

    @NotNull
    public final IEventSender getWebViewEventSender() {
        return webViewEventSender;
    }
}
