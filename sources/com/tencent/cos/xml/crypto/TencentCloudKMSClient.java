package com.tencent.cos.xml.crypto;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.kms.v20190118.KmsClient;
import com.tencentcloudapi.kms.v20190118.models.DecryptRequest;
import com.tencentcloudapi.kms.v20190118.models.DecryptResponse;
import com.tencentcloudapi.kms.v20190118.models.EncryptRequest;
import com.tencentcloudapi.kms.v20190118.models.EncryptResponse;
import com.tencentcloudapi.kms.v20190118.models.GenerateDataKeyRequest;
import com.tencentcloudapi.kms.v20190118.models.GenerateDataKeyResponse;
import java.util.Locale;
import tb.c;
import tb.g;
import tb.h;
import tb.q;

/* JADX INFO: loaded from: classes7.dex */
public class TencentCloudKMSClient implements QCLOUDKMS {
    private g credentialProvider;
    private final KmsClient kmsClient;

    public TencentCloudKMSClient(String str, g gVar) {
        this.kmsClient = new KmsClient((Credential) null, str);
        this.credentialProvider = gVar;
    }

    private CosXmlClientException getClientException(TencentCloudSDKException tencentCloudSDKException, String str) {
        return new CosXmlClientException(ClientErrorCode.KMS_ERROR.getCode(), String.format(Locale.ENGLISH, "%s: %s, error code: %s, requestId: %s", str, tencentCloudSDKException.getMessage(), tencentCloudSDKException.getErrorCode(), tencentCloudSDKException.getRequestId()));
    }

    public void assetCredentials() throws CosXmlClientException {
        Credential credential;
        try {
            h hVarB = this.credentialProvider.b();
            if (hVarB instanceof q) {
                q qVar = (q) hVarB;
                credential = new Credential(qVar.c(), qVar.a(), qVar.i());
            } else {
                if (!(hVarB instanceof c)) {
                    throw CosXmlClientException.internalException("credentials is neither SessionQCloudCredentials nor BasicQCloudCredentials ");
                }
                c cVar = (c) hVarB;
                credential = new Credential(cVar.c(), cVar.a());
            }
            this.kmsClient.setCredential(credential);
        } catch (QCloudClientException e10) {
            throw CosXmlClientException.internalException(e10.getMessage());
        }
    }

    @Override // com.tencent.cos.xml.crypto.QCLOUDKMS
    public DecryptResponse decrypt(DecryptRequest decryptRequest) throws CosXmlClientException {
        try {
            assetCredentials();
            return this.kmsClient.Decrypt(decryptRequest);
        } catch (TencentCloudSDKException e10) {
            throw getClientException(e10, "TencentCloudKMS Service got exception while Decrypt");
        }
    }

    @Override // com.tencent.cos.xml.crypto.QCLOUDKMS
    public EncryptResponse encrypt(EncryptRequest encryptRequest) throws CosXmlClientException {
        try {
            assetCredentials();
            return this.kmsClient.Encrypt(encryptRequest);
        } catch (TencentCloudSDKException e10) {
            throw getClientException(e10, "TencentCloudKMS Service got exception while Encrypt");
        }
    }

    @Override // com.tencent.cos.xml.crypto.QCLOUDKMS
    public GenerateDataKeyResponse generateDataKey(GenerateDataKeyRequest generateDataKeyRequest) throws CosXmlClientException {
        try {
            assetCredentials();
            return this.kmsClient.GenerateDataKey(generateDataKeyRequest);
        } catch (TencentCloudSDKException e10) {
            throw getClientException(e10, "TencentCloudKMS Service got exception while GenerateDataKey");
        }
    }

    @Override // com.tencent.cos.xml.crypto.QCLOUDKMS
    public void shutdown() {
    }
}
