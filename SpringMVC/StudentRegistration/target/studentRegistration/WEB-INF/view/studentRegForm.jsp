<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel ="stylesheet" href="/StudentRegistration/resources/bootstrap/css/bootstrap.min.css" ></link>
<link rel ="stylesheet" href="/StudentRegistration/resources/bootstrap/css/bootstrap-theme.min.css" ></link>
<script type="text/javascript" src="/StudentRegistration/resources/js/jquery-1.12.1.min.js"></script>
<script src="/StudentRegistration/resources/bootstrap/js/bootstrap.min.js"></script>
<script src = "/StudentRegistration/resources/js/customjs/studentReg.js"></script>
<script type="text/javascript" src ="/StudentRegistration/resources/js/customjs/studentValidation.js" ></script>
<title>Registration</title>
</head>
<body>
	<div class="container">

		<form class="well form-horizontal"
			id="contact_form">
			<fieldset>

				<!-- Form Name -->
				<legend>
					<center>
						<h2>
							<b>Student Registration Form</b>
						</h2>
					</center>
				</legend>
				<br>

				<!-- Enter First Name start-->

				<div class="form-group">
					<label class="col-md-4 control-label">First Name</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input name="first_name"
								placeholder="First Name" id ="first_name" class="form-control" type="text">
						</div>
					</div>
				</div>
				<!-- Enter First Name End-->

				<!-- Enter Last Name start-->

				<div class="form-group">
					<label class="col-md-4 control-label">Last Name</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input name="last_name"
								placeholder="Last Name" id="last_name" class="form-control" type="text">
						</div>
					</div>
				</div>
				
				<!-- Enter Last Name End-->
				
				<!-- Enter FullName Start-->

				<div class="form-group">
					<label class="col-md-4 control-label">Fullname</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input name="user_name"
								placeholder="Username" id ="full_name" class="form-control" type="text">
						</div>
					</div>
				</div>
				
				<!-- Enter  FullName End-->
				
				<!-- Enter Email start-->
				<div class="form-group">
					<label class="col-md-4 control-label">E-Mail</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-envelope"></i></span> <input name="email"
								placeholder="E-Mail Address" id ="e_mail" class="form-control" type="text">
						</div>
					</div>
				</div>

				<!-- Enter Email End-->
				
				<!-- Enter Password start-->

				<div class="form-group">
					<label class="col-md-4 control-label">Password</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input
								name="user_password" id="password" placeholder="Password" class="form-control"
								type="password">
						</div>
					</div>
				</div>
				
							<!-- Enter Password End-->
			
			<!-- Enter Gender Start-->
							
				<div class="form-group">
					<label class="col-md-4 control-label">Gender</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> </span> 
								<select name="department" id="gender"
								class="form-control selectpicker">
								<option value="">--Select--</option>
								<option>Male</option>
								<option>Female</option>
								</select>
							
						</div>
					</div>
				</div>
							
			<!-- Enter Gender End-->
							
							

							<!-- Enter Country Name start-->

				<div class="form-group">
					<label class="col-md-4 control-label">Country</label>
					<div class="col-md-4 selectContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-list" ></i></span> <select name="department" id ="country"
								class="form-control selectpicker">
								<option value="">--Select--</option>
								<option value="AF">Afghanistan</option>
								<option value="AL">Albania</option>
								<option value="DZ">Algeria</option>
								<option value="AS">American Samoa</option>
								<option value="AD">Andorra</option>
								<option value="AG">Angola</option>
								<option value="AI">Anguilla</option>
								<option value="AG">Antigua &amp; Barbuda</option>
								<option value="AR">Argentina</option>
								<option value="AA">Armenia</option>
								<option value="AW">Aruba</option>
								<option value="AU">Australia</option>
								<option value="AT">Austria</option>
								<option value="AZ">Azerbaijan</option>
								<option value="BS">Bahamas</option>
								<option value="BH">Bahrain</option>
								<option value="BD">Bangladesh</option>
								<option value="BB">Barbados</option>
								<option value="BY">Belarus</option>
								<option value="BE">Belgium</option>
								<option value="BZ">Belize</option>
								<option value="BJ">Benin</option>
								<option value="BM">Bermuda</option>
								<option value="BT">Bhutan</option>
								<option value="BO">Bolivia</option>
								<option value="BL">Bonaire</option>
								<option value="BA">Bosnia &amp; Herzegovina</option>
								<option value="BW">Botswana</option>
								<option value="BR">Brazil</option>
								<option value="BC">British Indian Ocean Ter</option>
								<option value="BN">Brunei</option>
								<option value="BG">Bulgaria</option>
								<option value="BF">Burkina Faso</option>
								<option value="BI">Burundi</option>
								<option value="KH">Cambodia</option>
								<option value="CM">Cameroon</option>
								<option value="CA">Canada</option>
								<option value="IC">Canary Islands</option>
								<option value="CV">Cape Verde</option>
								<option value="KY">Cayman Islands</option>
								<option value="CF">Central African Republic</option>
								<option value="TD">Chad</option>
								<option value="CD">Channel Islands</option>
								<option value="CL">Chile</option>
								<option value="CN">China</option>
								<option value="CI">Christmas Island</option>
								<option value="CS">Cocos Island</option>
								<option value="CO">Colombia</option>
								<option value="CC">Comoros</option>
								<option value="CG">Congo</option>
								<option value="CK">Cook Islands</option>
								<option value="CR">Costa Rica</option>
								<option value="CT">Cote D'Ivoire</option>
								<option value="HR">Croatia</option>
								<option value="CU">Cuba</option>
								<option value="CB">Curacao</option>
								<option value="CY">Cyprus</option>
								<option value="CZ">Czech Republic</option>
								<option value="DK">Denmark</option>
								<option value="DJ">Djibouti</option>
								<option value="DM">Dominica</option>
								<option value="DO">Dominican Republic</option>
								<option value="TM">East Timor</option>
								<option value="EC">Ecuador</option>
								<option value="EG">Egypt</option>
								<option value="SV">El Salvador</option>
								<option value="GQ">Equatorial Guinea</option>
								<option value="ER">Eritrea</option>
								<option value="EE">Estonia</option>
								<option value="ET">Ethiopia</option>
								<option value="FA">Falkland Islands</option>
								<option value="FO">Faroe Islands</option>
								<option value="FJ">Fiji</option>
								<option value="FI">Finland</option>
								<option value="FR">France</option>
								<option value="GF">French Guiana</option>
								<option value="PF">French Polynesia</option>
								<option value="FS">French Southern Ter</option>
								<option value="GA">Gabon</option>
								<option value="GM">Gambia</option>
								<option value="GE">Georgia</option>
								<option value="DE">Germany</option>
								<option value="GH">Ghana</option>
								<option value="GI">Gibraltar</option>
								<option value="GB">Great Britain</option>
								<option value="GR">Greece</option>
								<option value="GL">Greenland</option>
								<option value="GD">Grenada</option>
								<option value="GP">Guadeloupe</option>
								<option value="GU">Guam</option>
								<option value="GT">Guatemala</option>
								<option value="GN">Guinea</option>
								<option value="GY">Guyana</option>
								<option value="HT">Haiti</option>
								<option value="HW">Hawaii</option>
								<option value="HN">Honduras</option>
								<option value="HK">Hong Kong</option>
								<option value="HU">Hungary</option>
								<option value="IS">Iceland</option>
								<option value="IN">India</option>
								<option value="ID">Indonesia</option>
								<option value="IA">Iran</option>
								<option value="IQ">Iraq</option>
								<option value="IR">Ireland</option>
								<option value="IM">Isle of Man</option>
								<option value="IL">Israel</option>
								<option value="IT">Italy</option>
								<option value="JM">Jamaica</option>
								<option value="JP">Japan</option>
								<option value="JO">Jordan</option>
								<option value="KZ">Kazakhstan</option>
								<option value="KE">Kenya</option>
								<option value="KI">Kiribati</option>
								<option value="NK">Korea North</option>
								<option value="KS">Korea South</option>
								<option value="KW">Kuwait</option>
								<option value="KG">Kyrgyzstan</option>
								<option value="LA">Laos</option>
								<option value="LV">Latvia</option>
								<option value="LB">Lebanon</option>
								<option value="LS">Lesotho</option>
								<option value="LR">Liberia</option>
								<option value="LY">Libya</option>
								<option value="LI">Liechtenstein</option>
								<option value="LT">Lithuania</option>
								<option value="LU">Luxembourg</option>
								<option value="MO">Macau</option>
								<option value="MK">Macedonia</option>
								<option value="MG">Madagascar</option>
								<option value="MY">Malaysia</option>
								<option value="MW">Malawi</option>
								<option value="MV">Maldives</option>
								<option value="ML">Mali</option>
								<option value="MT">Malta</option>
								<option value="MH">Marshall Islands</option>
								<option value="MQ">Martinique</option>
								<option value="MR">Mauritania</option>
								<option value="MU">Mauritius</option>
								<option value="ME">Mayotte</option>
								<option value="MX">Mexico</option>
								<option value="MI">Midway Islands</option>
								<option value="MD">Moldova</option>
								<option value="MC">Monaco</option>
								<option value="MN">Mongolia</option>
								<option value="MS">Montserrat</option>
								<option value="MA">Morocco</option>
								<option value="MZ">Mozambique</option>
								<option value="MM">Myanmar</option>
								<option value="NA">Nambia</option>
								<option value="NU">Nauru</option>
								<option value="NP">Nepal</option>
								<option value="AN">Netherland Antilles</option>
								<option value="NL">Netherlands (Holland, Europe)</option>
								<option value="NV">Nevis</option>
								<option value="NC">New Caledonia</option>
								<option value="NZ">New Zealand</option>
								<option value="NI">Nicaragua</option>
								<option value="NE">Niger</option>
								<option value="NG">Nigeria</option>
								<option value="NW">Niue</option>
								<option value="NF">Norfolk Island</option>
								<option value="NO">Norway</option>
								<option value="OM">Oman</option>
								<option value="PK">Pakistan</option>
								<option value="PW">Palau Island</option>
								<option value="PS">Palestine</option>
								<option value="PA">Panama</option>
								<option value="PG">Papua New Guinea</option>
								<option value="PY">Paraguay</option>
								<option value="PE">Peru</option>
								<option value="PH">Philippines</option>
								<option value="PO">Pitcairn Island</option>
								<option value="PL">Poland</option>
								<option value="PT">Portugal</option>
								<option value="PR">Puerto Rico</option>
								<option value="QA">Qatar</option>
								<option value="ME">Republic of Montenegro</option>
								<option value="RS">Republic of Serbia</option>
								<option value="RE">Reunion</option>
								<option value="RO">Romania</option>
								<option value="RU">Russia</option>
								<option value="RW">Rwanda</option>
								<option value="NT">St Barthelemy</option>
								<option value="EU">St Eustatius</option>
								<option value="HE">St Helena</option>
								<option value="KN">St Kitts-Nevis</option>
								<option value="LC">St Lucia</option>
								<option value="MB">St Maarten</option>
								<option value="PM">St Pierre &amp; Miquelon</option>
								<option value="VC">St Vincent &amp; Grenadines</option>
								<option value="SP">Saipan</option>
								<option value="SO">Samoa</option>
								<option value="AS">Samoa American</option>
								<option value="SM">San Marino</option>
								<option value="ST">Sao Tome &amp; Principe</option>
								<option value="SA">Saudi Arabia</option>
								<option value="SN">Senegal</option>
								<option value="RS">Serbia</option>
								<option value="SC">Seychelles</option>
								<option value="SL">Sierra Leone</option>
								<option value="SG">Singapore</option>
								<option value="SK">Slovakia</option>
								<option value="SI">Slovenia</option>
								<option value="SB">Solomon Islands</option>
								<option value="OI">Somalia</option>
								<option value="ZA">South Africa</option>
								<option value="ES">Spain</option>
								<option value="LK">Sri Lanka</option>
								<option value="SD">Sudan</option>
								<option value="SR">Suriname</option>
								<option value="SZ">Swaziland</option>
								<option value="SE">Sweden</option>
								<option value="CH">Switzerland</option>
								<option value="SY">Syria</option>
								<option value="TA">Tahiti</option>
								<option value="TW">Taiwan</option>
								<option value="TJ">Tajikistan</option>
								<option value="TZ">Tanzania</option>
								<option value="TH">Thailand</option>
								<option value="TG">Togo</option>
								<option value="TK">Tokelau</option>
								<option value="TO">Tonga</option>
								<option value="TT">Trinidad &amp; Tobago</option>
								<option value="TN">Tunisia</option>
								<option value="TR">Turkey</option>
								<option value="TU">Turkmenistan</option>
								<option value="TC">Turks &amp; Caicos Is</option>
								<option value="TV">Tuvalu</option>
								<option value="UG">Uganda</option>
								<option value="UA">Ukraine</option>
								<option value="AE">United Arab Emirates</option>
								<option value="GB">United Kingdom</option>
								<option value="US">United States of America</option>
								<option value="UY">Uruguay</option>
								<option value="UZ">Uzbekistan</option>
								<option value="VU">Vanuatu</option>
								<option value="VS">Vatican City State</option>
								<option value="VE">Venezuela</option>
								<option value="VN">Vietnam</option>
								<option value="VB">Virgin Islands (Brit)</option>
								<option value="VA">Virgin Islands (USA)</option>
								<option value="WK">Wake Island</option>
								<option value="WF">Wallis &amp; Futana Is</option>
								<option value="YE">Yemen</option>
								<option value="ZR">Zaire</option>
								<option>Zambia</option>
								<option>Zimbabwe</option>
							</select>
						</div>
					</div>
				</div>
				
				<!-- Enter Country Name End-->
				
				
				<!-- Enter State Name start-->
				
				<div class="form-group">
					<label class="col-md-4 control-label">State</label>
					<div class="col-md-4 selectContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-list"></i></span> <select name="department" id ="state"
								class="form-control selectpicker">
								<option value="">--Select--</option>
								<option value="Andaman and Nicobar Islands">Andaman and
									Nicobar Islands</option>
								<option value="Andhra Pradesh">Andhra Pradesh</option>
								<option value="Arunachal Pradesh">Arunachal Pradesh</option>
								<option value="Assam">Assam</option>
								<option value="Bihar">Bihar</option>
								<option value="Chandigarh">Chandigarh</option>
								<option value="Chhattisgarh">Chhattisgarh</option>
								<option value="Dadra and Nagar Haveli">Dadra and Nagar
									Haveli</option>
								<option value="Daman and Diu">Daman and Diu</option>
								<option value="Delhi">Delhi</option>
								<option value="Goa">Goa</option>
								<option value="Gujarat">Gujarat</option>
								<option value="Haryana">Haryana</option>
								<option value="Himachal Pradesh">Himachal Pradesh</option>
								<option value="Jammu and Kashmir">Jammu and Kashmir</option>
								<option value="Jharkhand">Jharkhand</option>
								<option value="Karnataka">Karnataka</option>
								<option value="Kerala">Kerala</option>
								<option value="Lakshadweep">Lakshadweep</option>
								<option value="Madhya Pradesh">Madhya Pradesh</option>
								<option value="Maharashtra">Maharashtra</option>
								<option value="Manipur">Manipur</option>
								<option value="Meghalaya">Meghalaya</option>
								<option value="Mizoram">Mizoram</option>
								<option value="Nagaland">Nagaland</option>
								<option value="Orissa">Orissa</option>
								<option value="Pondicherry">Pondicherry</option>
								<option value="Punjab">Punjab</option>
								<option value="Rajasthan">Rajasthan</option>
								<option value="Sikkim">Sikkim</option>
								<option value="Tamil Nadu">Tamil Nadu</option>
								<option value="Tripura">Tripura</option>
								<option value="Uttaranchal">Uttaranchal</option>
								<option value="Uttar Pradesh">Uttar Pradesh</option>
								<option value="West Bengal">West Bengal</option>


							</select>
						</div>
					</div>
				</div>
				
				<!-- Enter State Name End-->
				
				<!--  select city code start -->

				<div class="form-group">
					<label class="col-md-4 control-label">City</label>
					<div class="col-md-4 selectContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-list"></i></span> <select name="department" id = "city"
								class="form-control selectpicker">
								<option value="">--Select--</option>
								<option selected="selected">-Select-</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#000000"><i>-Top Metropolitan Cities-</i></font></option>
								<option>Ahmedabad</option>
								<option>Bengaluru/Bangalore</option>
								<option>Chandigarh</option>
								<option>Chennai</option>
								<option>Delhi</option>
								<option>Gurgaon</option>
								<option>Hyderabad/Secunderabad</option>
								<option>Kolkatta</option>
								<option>Mumbai</option>
								<option>Noida</option>
								<option>Pune</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Andhra Pradesh-</i></font></option>
								<option>Anantapur</option>
								<option>Guntakal</option>
								<option>Guntur</option>
								<option>Hyderabad/Secunderabad</option>
								<option>kakinada</option>
								<option>kurnool</option>
								<option>Nellore</option>
								<option>Nizamabad</option>
								<option>Rajahmundry</option>
								<option>Tirupati</option>
								<option>Vijayawada</option>
								<option>Visakhapatnam</option>
								<option>Warangal</option>
								<option>Andra Pradesh-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Arunachal Pradesh-</i></font></option>
								<option>Itanagar</option>
								<option>Arunachal Pradesh-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Assam-</i></font></option>
								<option>Guwahati</option>
								<option>Silchar</option>
								<option>Assam-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Bihar-</i></font></option>
								<option>Bhagalpur</option>
								<option>Patna</option>
								<option>Bihar-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Chhattisgarh-</i></font></option>
								<option>Bhillai</option>
								<option>Bilaspur</option>
								<option>Raipur</option>
								<option>Chhattisgarh-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Goa-</i></font></option>
								<option>Panjim/Panaji</option>
								<option>Vasco Da Gama</option>
								<option>Goa-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Gujarat-</i></font></option>
								<option>Ahmedabad</option>
								<option>Anand</option>
								<option>Ankleshwar</option>
								<option>Bharuch</option>
								<option>Bhavnagar</option>
								<option>Bhuj</option>
								<option>Gandhinagar</option>
								<option>Gir</option>
								<option>Jamnagar</option>
								<option>Kandla</option>
								<option>Porbandar</option>
								<option>Rajkot</option>
								<option>Surat</option>
								<option>Vadodara/Baroda</option>
								<option>Valsad</option>
								<option>Vapi</option>
								<option>Gujarat-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Haryana-</i></font></option>
								<option>Ambala</option>
								<option>Chandigarh</option>
								<option>Faridabad</option>
								<option>Gurgaon</option>
								<option>Hisar</option>
								<option>Karnal</option>
								<option>Kurukshetra</option>
								<option>Panipat</option>
								<option>Rohtak</option>
								<option>Haryana-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Himachal Pradesh-</i></font></option>
								<option>Dalhousie</option>
								<option>Dharmasala</option>
								<option>Kulu/Manali</option>
								<option>Shimla</option>
								<option>Himachal Pradesh-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Jammu and Kashmir-</i></font></option>
								<option>Jammu</option>
								<option>Srinagar</option>
								<option>Jammu and Kashmir-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Jharkhand-</i></font></option>
								<option>Bokaro</option>
								<option>Dhanbad</option>
								<option>Jamshedpur</option>
								<option>Ranchi</option>
								<option>Jharkhand-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Karnataka-</i></font></option>
								<option>Bengaluru/Bangalore</option>
								<option>Belgaum</option>
								<option>Bellary</option>
								<option>Bidar</option>
								<option>Dharwad</option>
								<option>Gulbarga</option>
								<option>Hubli</option>
								<option>Kolar</option>
								<option>Mangalore</option>
								<option>Mysoru/Mysore</option>
								<option>Karnataka-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Kerala-</i></font></option>
								<option>Calicut</option>
								<option>Cochin</option>
								<option>Ernakulam</option>
								<option>Kannur</option>
								<option>Kochi</option>
								<option>Kollam</option>
								<option>Kottayam</option>
								<option>Kozhikode</option>
								<option>Palakkad</option>
								<option>Palghat</option>
								<option>Thrissur</option>
								<option>Trivandrum</option>
								<option>Kerela-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Madhya Pradesh-</i></font></option>
								<option>Bhopal</option>
								<option>Gwalior</option>
								<option>Indore</option>
								<option>Jabalpur</option>
								<option>Ujjain</option>
								<option>Madhya Pradesh-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Maharashtra-</i></font></option>
								<option>Ahmednagar</option>
								<option>Aurangabad</option>
								<option>Jalgaon</option>
								<option>Kolhapur</option>
								<option>Mumbai</option>
								<option>Mumbai Suburbs</option>
								<option>Nagpur</option>
								<option>Nasik</option>
								<option>Navi Mumbai</option>
								<option>Pune</option>
								<option>Solapur</option>
								<option>Maharashtra-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Manipur-</i></font></option>
								<option>Imphal</option>
								<option>Manipur-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Meghalaya-</i></font></option>
								<option>Shillong</option>
								<option>Meghalaya-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Mizoram-</i></font></option>
								<option>Aizawal</option>
								<option>Mizoram-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Nagaland-</i></font></option>
								<option>Dimapur</option>
								<option>Nagaland-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Orissa-</i></font></option>
								<option>Bhubaneshwar</option>
								<option>Cuttak</option>
								<option>Paradeep</option>
								<option>Puri</option>
								<option>Rourkela</option>
								<option>Orissa-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Punjab-</i></font></option>
								<option>Amritsar</option>
								<option>Bathinda</option>
								<option>Chandigarh</option>
								<option>Fazilka</option>
								<option>Jalandhar</option>
								<option>Ludhiana</option>
								<option>Mohali</option>
								<option>Pathankot</option>
								<option>Patiala</option>
								<option>Punjab-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Rajasthan-</i></font></option>
								<option>Ajmer</option>
								<option>Jaipur</option>
								<option>Jaisalmer</option>
								<option>Jodhpur</option>
								<option>Kota</option>
								<option>Udaipur</option>
								<option>Rajasthan-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Sikkim-</i></font></option>
								<option>Gangtok</option>
								<option>Sikkim-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Tamil Nadu-</i></font></option>
								<option>Chennai</option>
								<option>Coimbatore</option>
								<option>Cuddalore</option>
								<option>Erode</option>
								<option>Hosur</option>
								<option>Madurai</option>
								<option>Nagerkoil</option>
								<option>Ooty</option>
								<option>Salem</option>
								<option>Thanjavur</option>
								<option>Tirunalveli</option>
								<option>Trichy</option>
								<option>Tuticorin</option>
								<option>Vellore</option>
								<option>Tamil Nadu-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Tripura-</i></font></option>
								<option>Agartala</option>
								<option>Tripura-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Union Territories-</i></font></option>
								<option>Chandigarh</option>
								<option>Dadra & Nagar Haveli-Silvassa</option>
								<option>Daman & Diu</option>
								<option>Delhi</option>
								<option>Pondichery</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Uttar Pradesh-</i></font></option>
								<option>Agra</option>
								<option>Aligarh</option>
								<option>Allahabad</option>
								<option>Bareilly</option>
								<option>Faizabad</option>
								<option>Ghaziabad</option>
								<option>Gorakhpur</option>
								<option>Kanpur</option>
								<option>Lucknow</option>
								<option>Mathura</option>
								<option>Meerut</option>
								<option>Moradabad</option>
								<option>Noida</option>
								<option>Varanasi/Banaras</option>
								<option>Uttar Pradesh-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Uttaranchal-</i></font></option>
								<option>Dehradun</option>
								<option>Roorkee</option>
								<option>Uttaranchal-Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-West Bengal-</i></font></option>
								<option>Asansol</option>
								<option>Durgapur</option>
								<option>Haldia</option>
								<option>Kharagpur</option>
								<option>Kolkatta</option>
								<option>Siliguri</option>
								<option>West Bengal - Other</option>
								<option disabled="disabled" style="background-color: #3E3E3E"><font
										color="#FFFFFF"><i>-Other-</i></font></option>
								<option>Other</option>
							</select>
						</div>
					</div>
				</div>

				<!--  select city code end -->
				
				<!-- Enter Address start-->
				
				<div class="form-group">
					<label class="col-md-4 control-label">Address</label>
					<div class="col-md-4  inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-home"></i></span> <input name="address"
								placeholder="Address" id = "address" class="form-control" type="text">
						</div>
					</div>
				</div>
				
						<!-- Enter Address End-->
						
						<div class="form-group">
					<label class="col-md-4 control-label">Zip Code</label>
					<div class="col-md-4  inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-home"></i></span> <input name="zipcode"
								placeholder="zipcode"  id = "zip_code" class="form-control" type="text">
						</div>
					</div>
				</div>
						
						

				<!-- Enter Contact Number Start-->

				<div class="form-group">
					<label class="col-md-4 control-label">Contact No.</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-earphone"></i></span> <input
								name="contact_no"  id = "contact_no" placeholder="(+91)" class="form-control"
								type="text">
						</div>
					</div>
				</div>
				
				<!-- Enter Contact Number Start-->
				
				<!-- Button  Start-->
				<div class="form-group">
					<label class="col-md-4 control-label"></label>
					<div class="col-md-4">
						<br>
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						<button type="submit" class="btn btn-warning" id = "stu_submit" onclick="STUDENT.registerFunction();">
							&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspSUBMIT <span
								class="glyphicon glyphicon-send"></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						</button>
					</div>
				</div>
				
				<!-- Button End -->

			</fieldset>
		</form>
	</div>
	</div>
	<!-- /.container -->

</body>
</html>