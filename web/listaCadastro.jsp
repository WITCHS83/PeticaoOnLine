<!DOCTYPE html>
<html>
    <head>
        <title>Relatório de Cadastro</title>
        <meta charset="utf-8" />
        <meta name = "viewport" content = "width=device-width, maximum-scale = 1, minimum-scale=1" />
        <link rel="stylesheet" type="text/css" href="css/default.css" media="all" />
        <link rel="stylesheet" href="css/flexslider.css" type="text/css" />
        <link rel="stylesheet" href="css/fixed-navigation.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=PT+Sans' rel='stylesheet' type='text/css' />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
        <script src="js/jquery.flexslider.js"></script>
        <script src="js/default.js"></script>

    </head>

    <section id="Cadastro" class="row grey">
        <div class="center">
            <u><h1>Detalhes do cadastro:</h1></u>
            <div class="columns">
                <div class="center">
                    <form action="CadastroServlet" method="POST" class="form">

                        <fieldset>

                            <p><h2>
                                
                                
                                <%
                                    String PrimeiroNome = request.getParameter("PrimeiroNome");
                                    out.println("Primeiro nome: " + PrimeiroNome);
                                %></br>
                                <%
                                    String SegundoNome = request.getParameter("SegundoNome");
                                    out.println("Ultimo nome: " + SegundoNome);
                                %></br>
                                <%
                                    String Endereco = request.getParameter("Endereco");
                                    out.println("Endereço: " + Endereco);
                                %></br>
                                <%
                                    String EndNum = request.getParameter("EndNum");
                                    out.println("Numero: " + EndNum);
                                %></br>
                                <%
                                    String Cidade = request.getParameter("Cidade");
                                    out.println("Cidade: " + Cidade);
                                %></br>
                                <%
                                    String UF = request.getParameter("UF");
                                    out.println("Estado " + UF);
                                %></br>
                                <%
                                    String Email = request.getParameter("Email");
                                    out.println("Email: " + Email);
                                %></br>
                                
                                
                            </h2></p>



                        </fieldset>
                    </form>

                    </section>
                    <body>   

                        <div class="buttons">
                            <a href="index.jsp" class="btn btnGreen"><span>Sair</span></a>
                        </div>
                        <div class="buttons">
                            <a href="cadastro.html" class="btn btnGreen"><span>Novo cadastro</span></a>
                        </div>
                        <div class="buttons">

                            <!--comando para impressão do navegador... -->

                            <a href="javascript:window.print();" class="btn btnGreen"><span>Visualizar para impressão</span> </a>
                        </div>



                    </body>
                    </html>
