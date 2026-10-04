package com.prism.gaia.naked.metadata.android.net.wifi;

import W6.c;
import W6.m;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.net.wifi.WifiInfoCAGI;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class WifiInfoCAG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Impl_C f165849C = new Impl_C();

    @m
    public static final class Impl_C implements WifiInfoCAGI.C {
        private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry((Class<?>) WifiInfo.class);
        private InitOnceTry<NakedConstructor<WifiInfo>> __ctor = new InitOnceTry<>(new InitOnce.Init() { // from class: Y8.b
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f79334a.lambda$new$0();
            }
        });
        private InitOnceTry<NakedObject<String>> __mMacAddress = new InitOnceTry<>(new InitOnce.Init() { // from class: Y8.e
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f79337a.lambda$new$1();
            }
        });
        private InitOnceTry<NakedInt> __mNetworkId = new InitOnceTry<>(new InitOnce.Init() { // from class: Y8.f
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f79338a.lambda$new$2();
            }
        });
        private InitOnceTry<NakedInt> __mLinkSpeed = new InitOnceTry<>(new InitOnce.Init() { // from class: Y8.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f79339a.lambda$new$3();
            }
        });
        private InitOnceTry<NakedInt> __mFrequency = new InitOnceTry<>(new InitOnce.Init() { // from class: Y8.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f79340a.lambda$new$4();
            }
        });
        private InitOnceTry<NakedInt> __mRssi = new InitOnceTry<>(new InitOnce.Init() { // from class: Y8.i
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f79341a.lambda$new$5();
            }
        });
        private InitOnceTry<NakedObject<SupplicantState>> __mSupplicantState = new InitOnceTry<>(new InitOnce.Init() { // from class: Y8.j
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f79342a.lambda$new$6();
            }
        });
        private InitOnceTry<NakedObject<InetAddress>> __mIpAddress = new InitOnceTry<>(new InitOnce.Init() { // from class: Y8.k
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f79343a.lambda$new$7();
            }
        });
        private InitOnceTry<NakedObject<Object>> __mWifiSsid = new InitOnceTry<>(new InitOnce.Init() { // from class: Y8.l
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f79344a.lambda$new$8();
            }
        });
        private InitOnceTry<NakedObject<String>> __mBSSID = new InitOnceTry<>(new InitOnce.Init() { // from class: Y8.c
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f79335a.lambda$new$9();
            }
        });
        private InitOnceTry<NakedObject<String>> __mSSID = new InitOnceTry<>(new InitOnce.Init() { // from class: Y8.d
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f79336a.lambda$new$10();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedConstructor lambda$new$0() throws Exception {
            return new NakedConstructor(ORG_CLASS());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mMacAddress");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$10() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mSSID");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$2() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mNetworkId");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$3() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mLinkSpeed");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$4() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mFrequency");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedInt lambda$new$5() throws Exception {
            return new NakedInt((Class<?>) ORG_CLASS(), "mRssi");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$6() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mSupplicantState");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$7() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mIpAddress");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$8() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mWifiSsid");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$9() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mBSSID");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.wifi.WifiInfoCAGI.C
        public NakedConstructor<WifiInfo> ctor() {
            return this.__ctor.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.wifi.WifiInfoCAGI.C
        public NakedObject<String> mBSSID() {
            return this.__mBSSID.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.wifi.WifiInfoCAGI.C
        public NakedInt mFrequency() {
            return this.__mFrequency.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.wifi.WifiInfoCAGI.C
        public NakedObject<InetAddress> mIpAddress() {
            return this.__mIpAddress.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.wifi.WifiInfoCAGI.C
        public NakedInt mLinkSpeed() {
            return this.__mLinkSpeed.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.wifi.WifiInfoCAGI.C
        public NakedObject<String> mMacAddress() {
            return this.__mMacAddress.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.wifi.WifiInfoCAGI.C
        public NakedInt mNetworkId() {
            return this.__mNetworkId.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.wifi.WifiInfoCAGI.C
        public NakedInt mRssi() {
            return this.__mRssi.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.wifi.WifiInfoCAGI.C
        public NakedObject<String> mSSID() {
            return this.__mSSID.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.wifi.WifiInfoCAGI.C
        public NakedObject<SupplicantState> mSupplicantState() {
            return this.__mSupplicantState.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.net.wifi.WifiInfoCAGI.C
        public NakedObject<Object> mWifiSsid() {
            return this.__mWifiSsid.get();
        }
    }
}
