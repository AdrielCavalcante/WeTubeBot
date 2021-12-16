import React from "react";

import { Container, Title, Comandos, Comando, Nome, Descricao, Sinonimos, Exemplo } from "./styles";

const Main: React.FC = () => {
    return (
        <main>
            {/*Wave*/}
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1440 210"><path fill="#FF1800" fill-opacity="1" d="M0,192L40,170.7C80,149,160,107,240,112C320,117,400,171,480,192C560,213,640,203,720,181.3C800,160,880,128,960,112C1040,96,1120,96,1200,112C1280,128,1360,160,1400,176L1440,192L1440,0L1400,0C1360,0,1280,0,1200,0C1120,0,1040,0,960,0C880,0,800,0,720,0C640,0,560,0,480,0C400,0,320,0,240,0C160,0,80,0,40,0L0,0Z"></path></svg>
            <Container>
                <Title>Comandos</Title>
                <Comandos>
                    {/*Adicionar um loop para cada Comando e fazer seus dados dinâmicos*/}
                    <Comando>
                        <Nome>Ping</Nome>
                        <Descricao><span>Função: </span>Mostra o Ping do bot para o servidor.</Descricao>
                        <Sinonimos><span>Sinônimos: </span>Não possui</Sinonimos>
                        <Exemplo><span>Por exemplo: </span>we!ping</Exemplo>
                    </Comando>
                    <Comando>
                        <Nome>Comunismo</Nome>
                        <Descricao><span>Função: </span>Glorifica o Comunismo para o servidor.</Descricao>
                        <Sinonimos><span>Sinônimos: </span>Não possui</Sinonimos>
                        <Exemplo><span>Por exemplo: </span>we!comunismo</Exemplo>
                    </Comando>
                </Comandos>
            </Container>
        </main>
    );
};

export default Main;