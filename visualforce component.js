<apex:page >
    <apex:form>
    <apex:pageBlock title="Customer Registraion Form">
        <apex:pageBlockSection title="Personal Information" columns="1">
            <apex:inputfield value= "{!Account.Name}"/>
            <apex:inputfield value= "{!Account.Phone}"/>
            <apex:pageBlockSection>
            <apex:pageBlockSection title=" Address Information" columns="1">
                <apex:inputfield value="{!Account.BillingStreet}"/>
                <apex:inputfield value="{!Account.Billing City}"/>
                <apex:inputfield value="{!Account.Billing state}"/>
                <apex:inputfield value="{!Account.Billing country}"/>
                <apex:inputfield value="{!Account.Billing postalcode}"/>
                </apex:pageBlockSection>
            </apex:pageBlockSection>
        </apex:pageBlockSection>
             </apex:pageBlock>
    </apex:form>
</apex:page>