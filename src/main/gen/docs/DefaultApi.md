# DefaultApi

All URIs are relative to *https://api.saludvital.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**crearPreRegistro**](DefaultApi.md#crearPreRegistro) | **POST** /pre-registros | Registrar un nuevo paciente para facturación |


<a id="crearPreRegistro"></a>
# **crearPreRegistro**
> CrearPreRegistro201Response crearPreRegistro(preRegistro)

Registrar un nuevo paciente para facturación

Envía los datos de un paciente que ha agendado una atención para su procesamiento financiero inmediato.

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
    defaultClient.setBasePath("https://api.saludvital.com/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PreRegistro preRegistro = new PreRegistro(); // PreRegistro | Objeto JSON con la información obligatoria del paciente.
    try {
      CrearPreRegistro201Response result = apiInstance.crearPreRegistro(preRegistro);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#crearPreRegistro");
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
| **preRegistro** | [**PreRegistro**](PreRegistro.md)| Objeto JSON con la información obligatoria del paciente. | |

### Return type

[**CrearPreRegistro201Response**](CrearPreRegistro201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Registro creado exitosamente. |  -  |
| **400** | Error de validación (campos faltantes o formatos incorrectos). |  -  |

