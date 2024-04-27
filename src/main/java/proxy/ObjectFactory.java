
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Account_QNAME = new QName("http://tpjaxws.sid.org/", "account");
    private static final QName _ConvertEuroToDH_QNAME = new QName("http://tpjaxws.sid.org/", "convertEuroToDH");
    private static final QName _ConvertEuroToDHResponse_QNAME = new QName("http://tpjaxws.sid.org/", "convertEuroToDHResponse");
    private static final QName _GetAccount_QNAME = new QName("http://tpjaxws.sid.org/", "getAccount");
    private static final QName _GetAccountResponse_QNAME = new QName("http://tpjaxws.sid.org/", "getAccountResponse");
    private static final QName _ListAccounts_QNAME = new QName("http://tpjaxws.sid.org/", "listAccounts");
    private static final QName _ListAccountsResponse_QNAME = new QName("http://tpjaxws.sid.org/", "listAccountsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link ConvertEuroToDH }
     * 
     * @return
     *     the new instance of {@link ConvertEuroToDH }
     */
    public ConvertEuroToDH createConvertEuroToDH() {
        return new ConvertEuroToDH();
    }

    /**
     * Create an instance of {@link ConvertEuroToDHResponse }
     * 
     * @return
     *     the new instance of {@link ConvertEuroToDHResponse }
     */
    public ConvertEuroToDHResponse createConvertEuroToDHResponse() {
        return new ConvertEuroToDHResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     * @return
     *     the new instance of {@link GetAccount }
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountResponse }
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link ListAccounts }
     * 
     * @return
     *     the new instance of {@link ListAccounts }
     */
    public ListAccounts createListAccounts() {
        return new ListAccounts();
    }

    /**
     * Create an instance of {@link ListAccountsResponse }
     * 
     * @return
     *     the new instance of {@link ListAccountsResponse }
     */
    public ListAccountsResponse createListAccountsResponse() {
        return new ListAccountsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     */
    @XmlElementDecl(namespace = "http://tpjaxws.sid.org/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://tpjaxws.sid.org/", name = "convertEuroToDH")
    public JAXBElement<ConvertEuroToDH> createConvertEuroToDH(ConvertEuroToDH value) {
        return new JAXBElement<>(_ConvertEuroToDH_QNAME, ConvertEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tpjaxws.sid.org/", name = "convertEuroToDHResponse")
    public JAXBElement<ConvertEuroToDHResponse> createConvertEuroToDHResponse(ConvertEuroToDHResponse value) {
        return new JAXBElement<>(_ConvertEuroToDHResponse_QNAME, ConvertEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://tpjaxws.sid.org/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tpjaxws.sid.org/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccounts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListAccounts }{@code >}
     */
    @XmlElementDecl(namespace = "http://tpjaxws.sid.org/", name = "listAccounts")
    public JAXBElement<ListAccounts> createListAccounts(ListAccounts value) {
        return new JAXBElement<>(_ListAccounts_QNAME, ListAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tpjaxws.sid.org/", name = "listAccountsResponse")
    public JAXBElement<ListAccountsResponse> createListAccountsResponse(ListAccountsResponse value) {
        return new JAXBElement<>(_ListAccountsResponse_QNAME, ListAccountsResponse.class, null, value);
    }

}
