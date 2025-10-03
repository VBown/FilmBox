package android.bootcamp.filmbox.view.auth.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.bootcamp.filmbox.R
import android.bootcamp.filmbox.ui.theme.Amber200
import android.bootcamp.filmbox.ui.theme.Amber400
import android.bootcamp.filmbox.ui.theme.Indigo650
import android.bootcamp.filmbox.ui.theme.Indigo950
import android.bootcamp.filmbox.ui.theme.Slate200

@Preview
@Composable
fun RegisterScreen(

){
        Column(Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Spacer(Modifier.height(42.dp))

            Image(
                modifier = Modifier.size(150.dp),
                painter = painterResource(R.drawable.logo),
                contentDescription = "Logo de la App"
            )
            Text(text = "Regístrate para acceder\na tu caja de películas",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge.copy(
                    color= Slate200
                ))

            Spacer(Modifier.height(16.dp))

            FormRegisterParent()

            ButtonsRegister()

            Text(text = "Al registrate, aceptas nuestras\nCondiciones y Política de privacidad",
                Modifier.padding(20.dp),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.labelSmall.copy(
                    color= Slate200
                ))
            Spacer(Modifier.height(36.dp))

            ButtonsFoot()

        }
    }

@Composable
fun ButtonsRegister(){

    Column (Modifier.fillMaxWidth(0.8f)
        .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondary,
                disabledContainerColor = Amber200,
                disabledContentColor = Indigo650,
            )
        ) {
            Text("Registrar",
                style = MaterialTheme.typography.bodyLarge.copy(
                    color = Indigo950
                ),
                textAlign = TextAlign.Center
             )
        }

    }
}

@Composable
fun ButtonsFoot(){

    Row(

        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically

    ) {

        Text(
            "¿Ya Tienes una cuenta?",
            style = MaterialTheme.typography.labelMedium.copy(
                color = Slate200
            )
        )

        OutlinedButton(onClick = {}) {
            Text(
                "Ingresa Aquí",
                style = MaterialTheme.typography.labelSmall.copy(
                    color = Amber400
                )
            )
        }
    }
}

@Composable
fun FormRegisterParent(){
    var phoneNumberOrEmail by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var user by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column (Modifier.fillMaxWidth().padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        MyPhoneNumberOrEmailField(phoneNumberOrEmail = phoneNumberOrEmail) { phoneNumberOrEmail = it }
        MyNameField(name = name) { name = it }
        MyUserField(user = user) { user = it }
        MyPasswordField(password = password) { password = it }
    }
}

@Composable
fun MyPhoneNumberOrEmailField(phoneNumberOrEmail: String, onValueChange: (String) -> Unit){
    OutlinedTextField(
        modifier =  Modifier.width(300.dp),
        shape = RoundedCornerShape(16.dp),
        value = phoneNumberOrEmail,
        onValueChange = { onValueChange(it) },
        label = { Text("Correo electrónico",
            style= MaterialTheme.typography.labelLarge)},
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Indigo950,
            focusedTextColor = Indigo950,
            unfocusedContainerColor = Slate200,
            focusedContainerColor = Slate200,
            cursorColor = Indigo950,
            focusedIndicatorColor = Slate200,
            unfocusedIndicatorColor = Slate200
        ),
        textStyle = MaterialTheme.typography.bodyMedium.copy(
            color = Indigo950
        )
    )
}
@Composable
fun MyNameField(name: String, onValueChange: (String) -> Unit){
    OutlinedTextField(
        modifier =  Modifier.width(300.dp),
        shape = RoundedCornerShape(16.dp),
        value = name,
        onValueChange = { onValueChange(it) },
        label = { Text("Nombre completo",
            style= MaterialTheme.typography.labelLarge)},
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Indigo950,
            focusedTextColor = Indigo950,
            unfocusedContainerColor = Slate200,
            focusedContainerColor = Slate200,
            cursorColor = Indigo950,
            focusedIndicatorColor = Slate200,
            unfocusedIndicatorColor = Slate200
        ),
        textStyle = MaterialTheme.typography.bodyMedium.copy(
            color = Indigo950
        )
    )
}
@Composable
fun MyUserField(user: String, onValueChange: (String) -> Unit){
    OutlinedTextField(
        modifier =  Modifier.width(300.dp),
        shape = RoundedCornerShape(16.dp),
        value = user,
        onValueChange = { onValueChange(it) },
        label = { Text("Nombre de usuario",
            style= MaterialTheme.typography.labelLarge)},
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Indigo950,
            focusedTextColor = Indigo950,
            unfocusedContainerColor = Slate200,
            focusedContainerColor = Slate200,
            cursorColor = Indigo950,
            focusedIndicatorColor = Slate200,
            unfocusedIndicatorColor = Slate200
        ),
        textStyle = MaterialTheme.typography.bodyMedium.copy(
            color = Indigo950
        )
    )
}

@Composable
fun MyPasswordField(password: String, onValueChange: (String) -> Unit){
    var passwordHidden by remember {mutableStateOf(true)}
    OutlinedTextField(
        modifier =  Modifier.width(300.dp),
        shape = RoundedCornerShape(16.dp),
        value = password,
        onValueChange = { onValueChange(it) },
        label = { Text("Contraseña",
            style= MaterialTheme.typography.labelLarge)},
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Indigo950,
            focusedTextColor = Indigo950,
            unfocusedContainerColor = Slate200,
            focusedContainerColor = Slate200,
            cursorColor = Indigo950,
            focusedIndicatorColor = Slate200,
            unfocusedIndicatorColor = Slate200
        ),
        textStyle = MaterialTheme.typography.bodyMedium.copy(
            color = Indigo950
        ),
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = if(passwordHidden) PasswordVisualTransformation() else VisualTransformation.None,
        trailingIcon = {

            val visibilityIcon =
                if (passwordHidden) R.drawable.visibility else R.drawable.visibility_off

            val description = if (passwordHidden) "Mostrar contraseña" else "Ocultar contraseña"

            Icon(
                painter = painterResource(id = visibilityIcon),
                contentDescription = description,
                modifier = Modifier.clickable {
                    passwordHidden = !passwordHidden
                }
            )

        }

    )
}
