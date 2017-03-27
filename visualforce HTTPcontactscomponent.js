<apex:page controller="HTTPcontactsController" tabStyle="Contact">
	<apex:form>
		<apex:pageBlock title="Add Contacts">
		<apex:pageBlockTable value="{!lstWI}" var="w">
		<apex:column headerValue="Select">
			<apex:inputCheckbox value="{!w.ischecked}"/>
			</apex:column>
			<apex:column headervalue="Contact Id" value="{!w.id}"/>
			<apex:column headervalue="Name value="{!w.name}"/>
			<apex:column headervalue="Email value="{!w.address}"/>
			<apex:column headervalue="Address" value="{!w.gender}"/>
			<apex: column headervalue="Mobile" value="{!w.mobile}"/>
			</apex:pageBlockTable>
			<apex:pageBlockButtons>
				<apex:commandButton value="Save" action="{!doSave}"/>
			</apex:pageBlockButtons>
		</apex:pageBlock>
	</apex:form>
</apex:page>