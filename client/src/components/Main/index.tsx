import React from "react";

import { Container, Conteudo, Titulo, Descricao, DiscordButton, ComandosButton, ButtonsArea, Gif } from "./styles";

import gif from '../../assets/wetubebot.gif';

const Main: React.FC = () => {
    return (
        <main>
            <Container>
                <Conteudo>
                    <Titulo>O bot de música mais estranho que você verá hoje</Titulo>
                    <Descricao>O WeTubeBot foi feito em java, usando um Wrapper chamado JDA. Conta com comandos básicos como os clássicos bots de música, para saber os comandos do bot, clique no botão amarelo abaixo. <br /> Caso tenha gostado da proposta, adicione o Bot em seu servidor :)</Descricao>
                    <ButtonsArea>
                        <DiscordButton>Adicionar Bot</DiscordButton> {/* Criar um componente de link btn. Além disso, REACT-ROUTER-DOM */}
                        <ComandosButton>Ver Comandos</ComandosButton>
                    </ButtonsArea>
                </Conteudo>
                <Gif>
                    <img src={gif} alt="gif de exemplo" width="220px" height="425px" />
                </Gif>
            </Container>
        </main>
    );
};

export default Main;