# DefaultApi

All URIs are relative to *http://localhost:8080/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**preRegistrosPost**](DefaultApi.md#preRegistrosPost) | **POST** /pre-registros | Enviar nuevo pre-registro de paciente |


<a id="preRegistrosPost"></a>
# **preRegistrosPost**
> PreRegistrosPost201Response preRegistrosPost(preRegistro)

Enviar nuevo pre-registro de paciente

Recibe la información del paciente para preparar el proceso financiero.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PreRegistro preRegistro = new PreRegistro(); // PreRegistro | 
    try {
      PreRegistrosPost201Response result = apiInstance.preRegistrosPost(preRegistro);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#preRegistrosPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **preRegistro** | [**PreRegistro**](PreRegistro.md)|  | |

### Return type

[**PreRegistrosPost201Response**](PreRegistrosPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Pre-registro aceptado exitosamente. |  -  |
| **400** | Error en la validación de los datos (campos vacíos o formato incorrecto). |  -  |

