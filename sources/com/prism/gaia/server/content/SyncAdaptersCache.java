package com.prism.gaia.server.content;

import android.content.Context;
import android.content.SyncAdapterType;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.prism.gaia.helper.utils.B;
import com.prism.gaia.naked.compat.android.content.SyncAdapterTypeCompat2;
import com.prism.gaia.naked.metadata.com.android.internal.ResCAG;
import com.prism.gaia.server.accounts.RegisteredServicesCache;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes6.dex */
public class SyncAdaptersCache extends RegisteredServicesCache<SyncAdapterType> {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f167060u = "android.content.SyncAdapter";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f167061v = "android.content.SyncAdapter";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f167062w = "sync-adapter";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f167059t = "asdf-".concat(SyncAdaptersCache.class.getSimpleName());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f167063x = new a();

    public static class SyncAdapterTypeParser extends RegisteredServicesCache.RemoteTypeParser<SyncAdapterType> {
        public static final Parcelable.Creator<SyncAdapterTypeParser> CREATOR = new a();

        public class a implements Parcelable.Creator<SyncAdapterTypeParser> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SyncAdapterTypeParser createFromParcel(Parcel parcel) {
                return new SyncAdapterTypeParser(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SyncAdapterTypeParser[] newArray(int i10) {
                return new SyncAdapterTypeParser[i10];
            }
        }

        @Override // com.prism.gaia.server.accounts.RegisteredServicesCache.RemoteTypeParser, com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
        }

        public SyncAdapterTypeParser(SyncAdaptersCache syncAdaptersCache, ResolveInfo resolveInfo) {
            super(syncAdaptersCache, resolveInfo);
        }

        /* JADX WARN: Finally extract failed */
        @Override // com.prism.gaia.server.accounts.RegisteredServicesCache.RemoteTypeParser
        public SyncAdapterType parseServiceAttributes(Resources resources, String str, AttributeSet attributeSet) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, ResCAG.f165977G.styleable.SyncAdapter().get());
            try {
                String string = typedArrayObtainAttributes.getString(ResCAG.f165977G.styleable.SyncAdapter_contentAuthority().get());
                String string2 = typedArrayObtainAttributes.getString(ResCAG.f165977G.styleable.SyncAdapter_accountType().get());
                if (string != null && string2 != null) {
                    SyncAdapterType syncAdapterTypeCtor = SyncAdapterTypeCompat2.Util.ctor(string, string2, typedArrayObtainAttributes.getBoolean(ResCAG.f165977G.styleable.SyncAdapter_userVisible().get(), true), typedArrayObtainAttributes.getBoolean(ResCAG.f165977G.styleable.SyncAdapter_supportsUploading().get(), true), typedArrayObtainAttributes.getBoolean(ResCAG.f165977G.styleable.SyncAdapter_isAlwaysSyncable().get(), false), typedArrayObtainAttributes.getBoolean(ResCAG.f165977G.styleable.SyncAdapter_allowParallelSyncs().get(), false), typedArrayObtainAttributes.getString(ResCAG.f165977G.styleable.SyncAdapter_settingsActivity().get()), null);
                    typedArrayObtainAttributes.recycle();
                    return syncAdapterTypeCtor;
                }
                typedArrayObtainAttributes.recycle();
                return null;
            } catch (Throwable th) {
                typedArrayObtainAttributes.recycle();
                throw th;
            }
        }

        private SyncAdapterTypeParser(Parcel parcel) {
            super(parcel);
        }
    }

    public static class a implements B<SyncAdapterType> {
        @Override // com.prism.gaia.helper.utils.B
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SyncAdapterType b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            return SyncAdapterType.newKey(xmlPullParser.getAttributeValue(null, "authority"), xmlPullParser.getAttributeValue(null, "accountType"));
        }

        @Override // com.prism.gaia.helper.utils.B
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(SyncAdapterType syncAdapterType, XmlSerializer xmlSerializer) throws IOException {
            xmlSerializer.attribute(null, "authority", syncAdapterType.authority);
            xmlSerializer.attribute(null, "accountType", syncAdapterType.accountType);
        }
    }

    public SyncAdaptersCache(Context context) {
        super(context, "android.content.SyncAdapter", "android.content.SyncAdapter", f167062w, f167063x);
    }

    @Override // com.prism.gaia.server.accounts.RegisteredServicesCache
    public RegisteredServicesCache.RemoteTypeParser<SyncAdapterType> w(ResolveInfo resolveInfo) {
        return new SyncAdapterTypeParser(this, resolveInfo);
    }
}
